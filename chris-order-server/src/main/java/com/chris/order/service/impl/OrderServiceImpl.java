package com.chris.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chris.entity.Order;
import com.chris.entity.Product;
import com.chris.order.mapper.OrderMapper;
import com.chris.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Order getOrderById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public Order createOrder(Long pid, Long userId) {
        log.info("接收到{}号商品的下单请求, 接下来调用商品微服务查询此商品信息", pid);
        Product product = restTemplate.getForObject("http://localhost:10110/product/getProductById/" + pid, Product.class);
        log.info("查询到{}号商品的信息, 内容是: {}", pid, JSON.toJSONString(product));

        if (product == null) {
             return null;
        }

        Order order = new Order();
        order.setPid(pid);
        order.setUserId(userId);
        order.setPName(product.getPName());
        order.setPPrice(product.getPPrice());
        order.setNumber(1);
        baseMapper.insert(order);
        log.info("创建订单成功, 订单信息为: {}", JSON.toJSONString(order));
        return order;
    }

}

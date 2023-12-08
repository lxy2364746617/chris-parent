package com.chris.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chris.entity.Order;
import com.chris.order.mapper.OrderMapper;
import com.chris.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Override
    public Order getOrderById(Long id) {
        return baseMapper.selectById(id);
    }

}

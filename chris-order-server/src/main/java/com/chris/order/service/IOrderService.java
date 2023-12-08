package com.chris.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chris.entity.Order;

public interface IOrderService extends IService<Order> {

    Order getOrderById(Long id);

}

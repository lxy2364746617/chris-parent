package com.chris.order.controller;

import com.chris.entity.Order;
import com.chris.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("/getOrderById")
    public Order getOrderById(@RequestParam("id") Long id) {
        return orderService.getOrderById(id);
    }

}

package com.chris.order.controller;

import com.chris.entity.Order;
import com.chris.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("/getOrderById")
    public Order getOrderById(@RequestParam("id") Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/createOrder")
    public Order createOrder(@RequestParam("pid") Long pid, @RequestParam("userId") Long userId) {
        return orderService.createOrder(pid, userId);
    }

}

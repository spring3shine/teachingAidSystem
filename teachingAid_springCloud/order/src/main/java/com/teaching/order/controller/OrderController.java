package com.teaching.order.controller;


import com.teaching.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("getAllMembers")
    public List<String> getAllMembers() {
        List<String> ret = orderService.getAllMembers();
        ret.add("this is Order-Service");
        return ret;
    }
}

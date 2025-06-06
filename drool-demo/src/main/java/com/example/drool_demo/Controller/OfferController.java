package com.example.drool_demo.Controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.drool_demo.model.Order;

@RestController
public class OfferController {
    @Autowired
    private KieSession kieSession;

    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order) {
        kieSession.insert(order);
        kieSession.fireAllRules();
        return order;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}

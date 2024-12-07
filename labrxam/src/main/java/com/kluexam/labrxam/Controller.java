package com.kluexam.labrxam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private OrderService oservice;

    @PostMapping("/addorder")
    public Order addOrder(@RequestBody Order order) {
        return oservice.addorderrr(order);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable("id") int id) {
        oservice.deleteorderrr(id);
    }
}

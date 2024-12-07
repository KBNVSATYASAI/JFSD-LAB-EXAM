package com.kluexam.labrxam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderJpaRepo orjpa;

    public Order addorderrr(Order order) {
        return orjpa.save(order);
    }

    public void deleteorderrr(int id) {
        orjpa.deleteById(id);
    }

}
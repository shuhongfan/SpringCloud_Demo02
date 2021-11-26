package com.shf.springcloud.service;

import com.shf.springcloud.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}



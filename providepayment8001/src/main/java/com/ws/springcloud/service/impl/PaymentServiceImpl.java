package com.ws.springcloud.service.impl;

import com.ws.springcloud.dao.PaymentDao;
import com.ws.springcloud.entities.Payment;
import com.ws.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/18 15:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

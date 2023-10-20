package com.ws.springcloud.service;

import com.ws.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/18 15:32
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

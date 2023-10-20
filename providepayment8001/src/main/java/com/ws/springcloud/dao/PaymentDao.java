package com.ws.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.ws.springcloud.entities.Payment;
/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/18 15:02
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

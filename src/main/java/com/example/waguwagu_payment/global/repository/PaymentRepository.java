package com.example.waguwagu_payment.global.repository;

import com.example.waguwagu_payment.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByIdAndCanceledFalse(Long id);
    Optional<Payment> findByOrderIdAndCanceledFalse(UUID orderId);
//    void deleteByOrderId(UUID orderId);
}

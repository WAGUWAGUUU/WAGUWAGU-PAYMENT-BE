package com.example.waguwagu_payment.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @Column(name = "PAYMENT_ID")
    private Long id;

    @Column(name = "ORDER_ID", unique = true)
    private UUID orderId;

    // 결제 시점
    @Column(name = "CREATED_AT")
    @Builder.Default
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

    @Column(name = "CANCELED")
    @Builder.Default
    @Setter
    private boolean canceled = false;
}

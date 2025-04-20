package org.example.transactionservice.models;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Transaction extends  BaseModel {

    @Column(unique = true, nullable = false)
    private String transactionId;

    @Column(nullable = false)
    private String senderId;

    @Column(nullable = false)
    private String receiverId;

    private String merchantId;

    @Column(nullable = false)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionStatus status;

    private String description;

    @Column(unique = true, nullable = false)
    private String idempotencyKey;

    private String paymentGateway;

    private String gatewayTransactionId;

    // for split payments
    private Boolean isSplitPayment;
    private String parentTransactionId;

    @PrePersist
    public void prePersist() {
        if (transactionId == null) {
            transactionId = UUID.randomUUID().toString();
        }
    }
}
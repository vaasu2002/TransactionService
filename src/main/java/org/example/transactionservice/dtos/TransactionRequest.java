package org.example.transactionservice.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionRequest {
    private String senderId;
    private String receiverId;
    private String merchantId;
    private BigDecimal amount;
    private String description;
    private String idempotencyKey;
    private String type; // P2P, MERCHANT_PAYMENT, SPLIT_PAYMENT
    private String paymentGateway; // UPI, CREDIT_CARD, etc.
    private List<SplitPaymentRequest> splitPayments;
}

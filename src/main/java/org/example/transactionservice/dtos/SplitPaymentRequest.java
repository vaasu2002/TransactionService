package org.example.transactionservice.dtos;

import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SplitPaymentRequest {
    private String receiverId;
    private BigDecimal amount;
    private String description;
}

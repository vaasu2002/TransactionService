package org.example.transactionservice.models;

enum TransactionStatus {
    INITIATED,
    PENDING,
    COMPLETED,
    FAILED,
    REVERSED
}

// INITIATED ---> The start of a transaction
// PENDING   ---> The transaction is still being processed or waiting for external input.
// COMPLETED ---> The transaction finished successfully.
// FAILED    ---> The transaction could not be completed due to an error or problem.
// REVERSED  ---> A completed transaction was undone. Cause - fraud detection
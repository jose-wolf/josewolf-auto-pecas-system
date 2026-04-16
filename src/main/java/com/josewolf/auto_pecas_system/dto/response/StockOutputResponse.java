package com.josewolf.auto_pecas_system.dto.response;

import java.math.BigDecimal;

public record StockOutputResponse(
        String productName,
        String originalCode,
        Integer quantityRemoved,
        Integer remainingQuantity,
        BigDecimal unitCostPrice,
        BigDecimal totalValueRemaining,
        String message
) {
}

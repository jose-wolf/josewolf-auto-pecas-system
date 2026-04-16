package com.josewolf.auto_pecas_system.dto.response;

import java.math.BigDecimal;

public record StockItemResponse(
        Long id,
        String productName,
        String originalCode,
        Integer quantity,
        BigDecimal unitCostPrice,
        BigDecimal totalValue
) {
}

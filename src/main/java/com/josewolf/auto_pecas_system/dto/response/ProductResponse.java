package com.josewolf.auto_pecas_system.dto.response;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,
        String name,
        String description,
        BigDecimal costPrice,
        BigDecimal profitMargin,
        BigDecimal salePrice,
        String originalCode
) {
}

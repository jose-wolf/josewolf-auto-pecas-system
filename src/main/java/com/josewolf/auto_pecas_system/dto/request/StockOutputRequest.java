package com.josewolf.auto_pecas_system.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record StockOutputRequest(
    @NotBlank(message = "O código do produto é obrigatório.")
    String originalCode,

    @NotNull(message = "A quantidade é obrigatória.")
    @Positive(message = "A quantidade deve ser maior que zero.")
    Integer quantity
) {
}

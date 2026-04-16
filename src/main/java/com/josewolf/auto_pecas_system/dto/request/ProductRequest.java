package com.josewolf.auto_pecas_system.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest(

    @NotBlank(message = "O nome é obrigatório.")
    String name,

    @NotBlank(message = "A descrição é obrigatória.")
    String description,

    @NotNull(message = "O preço de custo é obrigatório.")
    @PositiveOrZero(message = "O preço não pode ser negativo.")
    BigDecimal costPrice,

    @PositiveOrZero(message = "A margem não pode ser negativa.")
    BigDecimal profitMargin,

    @NotBlank(message = "O código original é obrigatório.")
    String originalCode
) {



}

package com.josewolf.auto_pecas_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal costPrice;
    @Column(precision = 5, scale = 2)
    private BigDecimal profitMargin;

    @Column(nullable = false, unique = true)
    private String originalCode;

    public BigDecimal getSalePrice() {
        BigDecimal safeCostPrice = costPrice == null ? BigDecimal.ZERO : costPrice;
        BigDecimal safeProfitMargin = profitMargin == null ? BigDecimal.ZERO : profitMargin;

        BigDecimal profitValue = safeCostPrice
                .multiply(safeProfitMargin)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);

        return safeCostPrice.add(profitValue);
    }

}

package com.josewolf.auto_pecas_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "product_id",nullable = false, unique = true)
    private Product product;

    public BigDecimal getTotalValue(){
        if (product == null || product.getCostPrice() == null || quantity == null) return BigDecimal.ZERO;
        return product.getCostPrice().multiply(BigDecimal.valueOf(quantity));
    }

}

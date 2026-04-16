package com.josewolf.auto_pecas_system.mapper;

import com.josewolf.auto_pecas_system.dto.response.StockOutputResponse;
import com.josewolf.auto_pecas_system.entity.StockItem;

public class StockOutputMapper {

    public static StockOutputResponse toResponse(StockItem stockItem, Integer quantityRemoved){
        return new StockOutputResponse(
                stockItem.getProduct().getName(),
                stockItem.getProduct().getOriginalCode(),
                quantityRemoved,
                stockItem.getQuantity(),
                stockItem.getProduct().getCostPrice(),
                stockItem.getTotalValue(),
                "Saída de estoque realizada com sucesso."
        );
    }

}

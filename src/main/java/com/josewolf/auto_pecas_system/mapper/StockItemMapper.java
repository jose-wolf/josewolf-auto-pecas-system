package com.josewolf.auto_pecas_system.mapper;

import com.josewolf.auto_pecas_system.dto.response.StockItemResponse;
import com.josewolf.auto_pecas_system.entity.StockItem;

public class StockItemMapper {

    public static StockItemResponse toResponse(StockItem stockItem){
        return new StockItemResponse(
                stockItem.getId(),
                stockItem.getProduct().getName(),
                stockItem.getProduct().getOriginalCode(),
                stockItem.getQuantity(),
                stockItem.getProduct().getCostPrice(),
                stockItem.getTotalValue()
        );
    }


}

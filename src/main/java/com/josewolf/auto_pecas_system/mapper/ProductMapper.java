package com.josewolf.auto_pecas_system.mapper;

import com.josewolf.auto_pecas_system.dto.request.ProductRequest;
import com.josewolf.auto_pecas_system.dto.response.ProductResponse;
import com.josewolf.auto_pecas_system.entity.Product;

public class ProductMapper {

    public static ProductResponse toResponse(Product product){
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getCostPrice(),
                product.getProfitMargin(),
                product.getSalePrice(),
                product.getOriginalCode()
        );
    }

    public static Product toEntity(ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.name());
        product.setDescription(productRequest.description());
        product.setCostPrice(productRequest.costPrice());
        product.setProfitMargin(productRequest.profitMargin());
        product.setOriginalCode(productRequest.originalCode());
        return product;
    }

}

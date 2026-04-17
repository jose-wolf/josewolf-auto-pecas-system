package com.josewolf.auto_pecas_system.repository;

import com.josewolf.auto_pecas_system.entity.Product;
import com.josewolf.auto_pecas_system.entity.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockItemRepository extends JpaRepository<StockItem, Long> {

    Optional<StockItem> findByProduct(Product product);

    List<StockItem> findByProductOriginalCodeStartingWithIgnoreCase(String originalCode);

    boolean existsByProduct(Product product);

}

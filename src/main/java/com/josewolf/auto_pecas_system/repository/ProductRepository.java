package com.josewolf.auto_pecas_system.repository;

import com.josewolf.auto_pecas_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    boolean existsByOriginalCode(String originalCode);

    Optional<Product> findByOriginalCode(String originalCode);

}

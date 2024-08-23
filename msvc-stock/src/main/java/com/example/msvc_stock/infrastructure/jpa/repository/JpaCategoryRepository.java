package com.example.msvc_stock.infrastructure.jpa.repository;

import com.example.msvc_stock.infrastructure.jpa.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {
    Optional<CategoryEntity> findByName(String name);
}

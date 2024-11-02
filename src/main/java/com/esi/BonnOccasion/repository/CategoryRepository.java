package com.esi.BonnOccasion.repository;



import com.esi.BonnOccasion.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

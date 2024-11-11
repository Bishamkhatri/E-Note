package com.enote.Repository;

import com.enote.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    List<Category> findByIsActiveTrue();
}

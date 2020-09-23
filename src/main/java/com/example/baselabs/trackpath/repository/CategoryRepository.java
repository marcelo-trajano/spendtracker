package com.example.baselabs.trackpath.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baselabs.trackpath.model.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}


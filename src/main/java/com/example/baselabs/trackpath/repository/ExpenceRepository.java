package com.example.baselabs.trackpath.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baselabs.trackpath.model.User;


@Repository
public interface ExpenceRepository extends JpaRepository<User, Long> {

}

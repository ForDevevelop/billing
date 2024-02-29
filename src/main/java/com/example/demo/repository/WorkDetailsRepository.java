package com.example.demo.repository;

import com.example.demo.entity.WorkDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface WorkDetailsRepository extends JpaRepository<WorkDetails, Long> {
}

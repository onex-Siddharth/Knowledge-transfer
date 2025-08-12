package com.example.cabservice.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCabRepository extends JpaRepository<CabEntity, Long> {
}

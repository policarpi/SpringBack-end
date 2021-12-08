package com.chicken.repository;

import com.chicken.entity.Fisiologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FisiologiaRepository extends JpaRepository<Fisiologia, Long> {



}
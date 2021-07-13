package com.stoad.demo.repository;

import com.stoad.demo.domain.entity.ChoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChoreRepository extends JpaRepository<ChoreEntity, Long> {

    List<ChoreEntity> findAll();

    ChoreEntity save(ChoreEntity chore);



}

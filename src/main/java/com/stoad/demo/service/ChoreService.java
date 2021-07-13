package com.stoad.demo.service;

import com.stoad.demo.domain.dto.ChoreDTO;

import java.util.List;

public interface ChoreService {

    List<ChoreDTO> findAll();

    ChoreDTO save(ChoreDTO choreDTO);

}

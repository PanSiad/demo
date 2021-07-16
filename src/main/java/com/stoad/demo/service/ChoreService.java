package com.stoad.demo.service;

import com.stoad.demo.domain.dto.ChoreDTO;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface ChoreService {

    List<ChoreDTO> findAll();

    ChoreDTO save(ChoreDTO choreDTO);

    List<ChoreDTO> findAllCached();

    void clearCache();

}

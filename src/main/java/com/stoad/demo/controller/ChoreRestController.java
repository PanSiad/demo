package com.stoad.demo.controller;

import com.stoad.demo.domain.dto.ChoreDTO;
import com.stoad.demo.service.ChoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chores")
public class ChoreRestController {

    @Autowired
    ChoreService choreService;

    //endpoint --> http://localhost:8080/chores/
    @GetMapping("/")
    public List<ChoreDTO> findAll() {
        List<ChoreDTO> listOfChoreDTOs = choreService.findAll();

        return listOfChoreDTOs;
    }

    @PostMapping("/add")
    public ChoreDTO createChore(@RequestBody ChoreDTO choreDTO) {
        return choreService.save(choreDTO);
    }

    @GetMapping("/cached/")
    @Cacheable("chores")
    public List<ChoreDTO> findAllCached() {
        List<ChoreDTO> listOfChoreDTOs = choreService.findAll();

        return listOfChoreDTOs;
    }

    @GetMapping("/cached/clear/")
    @CacheEvict(value="chores", allEntries = true)
    public void clearCache() {
        choreService.clearCache();
    }

}

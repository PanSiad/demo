package com.stoad.demo.service;

import com.stoad.demo.converter.ChoreConverter;
import com.stoad.demo.domain.dto.ChoreDTO;
import com.stoad.demo.domain.entity.ChoreEntity;
import com.stoad.demo.repository.ChoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChoreServiceImpl implements ChoreService {

    @Autowired
    private ChoreRepository choreRepository;

    @Override
    public List<ChoreDTO> findAll() {

        return choreRepository.findAll().stream()
                .map(ChoreConverter::convert)
                .collect(Collectors.toList());

    }

    @Override
    public ChoreDTO save(ChoreDTO choreDTO) {

        ChoreEntity choreEntity = ChoreConverter.convert(choreDTO);
        choreEntity.setTitle(choreDTO.getTitle());
        choreRepository.save(choreEntity);

        System.out.println("Chore saved!");
        return ChoreConverter.convert(choreEntity);
    }

}

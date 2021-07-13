package com.stoad.demo.converter;

import com.stoad.demo.domain.dto.ChoreDTO;
import com.stoad.demo.domain.entity.ChoreEntity;

import java.time.Instant;

public class ChoreConverter {

    public static ChoreEntity convert(ChoreDTO choreDTO) {

        ChoreEntity choreEntity = new ChoreEntity();
        choreEntity.setTitle(choreDTO.getTitle());
        choreEntity.setTimeCreated(Instant.now());

        return choreEntity;
    }

    public static ChoreDTO convert(ChoreEntity choreEntity) {

        ChoreDTO choreDTO = new ChoreDTO();
        choreDTO.setTitle(choreEntity.getTitle());

        return choreDTO;
    }



}

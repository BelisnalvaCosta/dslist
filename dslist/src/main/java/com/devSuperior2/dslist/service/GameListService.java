package com.devSuperior2.dslist.service;

import com.devSuperior2.dslist.dto.GameListDTO;
import com.devSuperior2.dslist.entities.GameList;
import com.devSuperior2.dslist.repository.GameListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}

package com.jenry.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenry.dslist.dto.GameDTO;
import com.jenry.dslist.dto.GameMinDTO;
import com.jenry.dslist.entities.Game;
import com.jenry.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	public List<GameMinDTO> findAll(){
		List<Game> result  = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}

package com.jenry.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jenry.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

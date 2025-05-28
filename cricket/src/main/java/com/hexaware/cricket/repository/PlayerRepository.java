package com.hexaware.cricket.repository;

import org.springframework.stereotype.Repository;

import com.hexaware.cricket.entity.Player;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>  {

}

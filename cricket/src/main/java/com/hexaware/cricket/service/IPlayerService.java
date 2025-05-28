package com.hexaware.cricket.service;

import java.util.List;

import com.hexaware.cricket.dto.PlayerDTO;
import com.hexaware.cricket.entity.Player;

public interface IPlayerService {
	
	public Player addPlayer(Player player);
	public Player updatePlayer(int playerId ,Player player);
	public PlayerDTO getById(int playerId);
	public String deletePlayerById( int playerId);
	public List<PlayerDTO>getAll();

}

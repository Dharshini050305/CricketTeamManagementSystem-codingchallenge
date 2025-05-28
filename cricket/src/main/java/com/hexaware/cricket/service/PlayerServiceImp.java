package com.hexaware.cricket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricket.dto.PlayerDTO;
import com.hexaware.cricket.entity.Player;
import com.hexaware.cricket.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements IPlayerService{
	
	@Autowired
	PlayerRepository repo;
	

	@Override
	public Player addPlayer(Player player) {
		return repo.save(player);
	}

	@Override
	public Player updatePlayer(int PlayerId,Player player) {
		return repo.save(player);
	}

	@Override
	public PlayerDTO getById(int playerId) {
		 Player player = repo.findById(playerId).orElse(null);
		 return new PlayerDTO(player.getPlayerId(), player.getPlayerName(), player.getJerseyNumber(), player.getRole());
	}

	@Override
	public String deletePlayerById(int playerId) {
		repo.deleteById(playerId);
		return "Player Deleted successfully Playerid: " +playerId;
	}

	@Override
	public List<PlayerDTO> getAll() {
		List<Player> players = repo.findAll();
        List<PlayerDTO> dtos = new ArrayList<>();
        for (Player p : players) {
            dtos.add(new PlayerDTO(p.getPlayerId(), p.getPlayerName(), p.getJerseyNumber(), p.getRole()));
        }
        return dtos;
	}
	

}

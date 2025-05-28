package com.hexaware.cricket.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricket.entity.Player;
import com.hexaware.cricket.exception.PlayerNotFoundException;
import com.hexaware.cricket.service.IPlayerService;
import com.hexaware.cricket.dto.PlayerDTO;

@RestController
@RequestMapping("/api/players")

public class PlayerRestController {
	@Autowired
	IPlayerService service;
	
	@PostMapping
		public  Player  addPlayer(@RequestBody  Player player) {
			
			  return service.addPlayer(player);
			
		} 
	@PutMapping("/:{playerId}")
	public Player updatePlayer(@PathVariable int playerId , @RequestBody Player update) {
		
		return  service.updatePlayer(playerId, update);
	}
	
	@GetMapping("/:{playerId}")
		public PlayerDTO  getById(@PathVariable   int playerId ) throws PlayerNotFoundException {
			
			
		  PlayerDTO playerDTO = service.getById( playerId);
		  
		
		  return playerDTO;
		  
	}  
			
		
	
	@DeleteMapping("/:{playerId}")
	public String deletePlayerById(@PathVariable int playerId) throws PlayerNotFoundException {

		
		return service.deletePlayerById(playerId);
		
		
	}
	
	
	
	@GetMapping
    public List<PlayerDTO> getAll() {
        return service.getAll();
    }


	

}

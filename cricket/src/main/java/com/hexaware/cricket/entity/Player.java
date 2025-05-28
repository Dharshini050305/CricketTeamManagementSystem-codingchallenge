package com.hexaware.cricket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	
	@NotBlank(message ="PlayerName cannot be null")
	@Size(min =2, max=50 )
	private String playerName;
	
	@NotNull(message ="jerseyNumber is mandatory")
	@Column(unique=true)
	private int jerseyNumber;
	
	@NotBlank(message = "Role is Mandatory")
    @Pattern(regexp = "Batsman|Bowler|Keeper|All Rounder", message = "Role must be one of: Batsman, Bowler, Keeper, All Rounder")
    private String role;
	
	@NotNull(message = "Matches mandatory")
    private long totalMatches;
	
	@NotBlank(message = "TeamName is Mandatory")
    private String teamName;

    @NotBlank(message = "Country name is mandatory")
    private String country;

    @Column(length = 500)
    private String description;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId,
			@NotBlank(message = "PlayerName cannot be null") @Size(min = 2, max = 50) String playerName,
			@NotNull(message = "jerseyNumber is mandatory") int jerseyNumber,
			@NotBlank(message = "Role is Mandatory") @Pattern(regexp = "Batsman|Bowler|Keeper|All Rounder", message = "Role must be one of: Batsman, Bowler, Keeper, All Rounder") String role,
			@NotNull(message = "Matches mandatory") long totalMatches,
			@NotBlank(message = "TeamName is Mandatory") String teamName,
			@NotBlank(message = "Country name is mandatory") String country, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.description = description;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(long totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", description=" + description + "]";
	}

	
	
	

}

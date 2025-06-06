package com.hexaware.cricket.dto;

public class PlayerDTO {
	 private int playerId;
	    private String playerName;
	    private int jerseyNumber;
	    private String role;
		public PlayerDTO() {
			super();
			
		}
		public PlayerDTO(int playerId, String playerName, int jerseyNumber, String role) {
			super();
			this.playerId = playerId;
			this.playerName = playerName;
			this.jerseyNumber = jerseyNumber;
			this.role = role;
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
		@Override
		public String toString() {
			return "PlayerDTO [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
					+ ", role=" + role + "]";
		}

	    
}

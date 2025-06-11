import { Component } from '@angular/core';
import { Players } from 'src/app/model/Player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent {
  playerId!: number;  // to bind playerId input
  player: Players = {
    playerId: 0,
    playerName: '',
    jerseyNumber: 0,
    role: '',
    teamName: '',
    country: '',
    totalMatches: 0,
    description: ''
  };

  constructor(private playerService: PlayerService) {}

  updatePlayer() {
    this.playerService.updatePlayer(this.playerId, this.player).subscribe(
      (response) => {
        alert("Player updated successfully!");
        console.log('Update response:', response);
      },
      (error) => {
        alert('Error updating player!');
        console.error(error);
      }
    );
  }
}



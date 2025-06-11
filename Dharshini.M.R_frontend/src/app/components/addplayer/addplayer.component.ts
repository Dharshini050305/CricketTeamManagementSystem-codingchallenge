import { Component } from '@angular/core';
import { Players } from 'src/app/model/Player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrls: ['./addplayer.component.css']
})
export class AddplayerComponent {
  constructor(private  playerService:PlayerService){}

  insertPlayer(data:Players){
    
        this.playerService.insert(data)
        .subscribe(
         (player)=>{console.log('Added Player is: '+player);}
          );


       

  }
}



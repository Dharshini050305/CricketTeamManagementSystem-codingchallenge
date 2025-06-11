import { Component } from '@angular/core';
import { Players } from 'src/app/model/Player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent {
  playerList:Players[] = [];

    constructor(private playerService:PlayerService){}


  ngOnInit(){

      this.getAll();

  }


  getAll(){
    
      this.playerService.getAll().subscribe( 
                                (list)=>{ this.playerList = list;  console.log(list)}
                                
                                  );

          

 }

  deleteById(playerId:number){

        this.playerService.delete(playerId).subscribe( (msg)=>{ console.log("Deleted "+msg);});

      
        this.getAll(); // to refresh list again

       

  }

  

}




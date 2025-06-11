import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Players } from 'src/app/model/Player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
   player?: Players;
  searchInput: string = '';
  errorMsg: string = '';

  constructor(private route: ActivatedRoute, private playerService: PlayerService) {}

  ngOnInit(): void {
    this.findById();
  }

  findById() {
    this.route.params.subscribe(param => {
      this.searchInput = param['input'];
      const playerId = Number(this.searchInput);

      if (!isNaN(playerId)) {
        this.playerService.getPlayerById(playerId).subscribe({
          next: (data) => {
            this.player = data;
            this.errorMsg = '';
            console.log('Player:', data);
          },
          error: (err) => {
            this.player = undefined;
            this.errorMsg = 'Player not found!';
            console.error(err);
          }
        });
      }
    });
  }

}

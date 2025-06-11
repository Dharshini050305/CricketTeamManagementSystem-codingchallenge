import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Players } from '../model/Player';

@Injectable({
  providedIn: 'root'
})

   export class PlayerService {
    constructor(private http:HttpClient) { }

  baseURL: string = "http://localhost:8087/api/players/";
  
 getAll():Observable<Players[]>{

        return this.http.get<Players[]>(this.baseURL+"getAll");


    }

  insert(body:Players):Observable<Players>{

      console.log(body);

        return this.http.post<Players>(this.baseURL+"add",body);

    }
updatePlayer(playerId: number, player: Players): Observable<Players> {
  return this.http.put<Players>(`${this.baseURL}update/${playerId}`, player);
}
  

delete(playerId: number): Observable<string> {
   return  this.http.delete<string>(this.baseURL+`deleteplayerbyid/${playerId}`);
}
 
 getPlayerById(id: number): Observable<Players> {
  return this.http.get<Players>(this.baseURL + 'getplayerbyid/' + id);
}
  }
 
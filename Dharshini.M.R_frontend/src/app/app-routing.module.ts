import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddplayerComponent } from './components/addplayer/addplayer.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { SearchComponent } from './components/search/search.component';
import { UpdateComponent } from './components/update/update.component';

const routes: Routes = [
{ path: 'home', component: DashboardComponent },
  { path: 'addplayer', component: AddplayerComponent },
  { path: 'updatePlayer', component: UpdateComponent },
  { path: 'displayall', component: DisplayallComponent },
  { path: 'search/:input', component: SearchComponent }

];
@NgModule({

  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

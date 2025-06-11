import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddplayerComponent } from './components/addplayer/addplayer.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { DisplayallComponent } from './components/displayall/displayall.component';
import { UpdateComponent } from './components/update/update.component';
import { SearchComponent } from './components/search/search.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AddplayerComponent,
    DashboardComponent,
    DisplayallComponent,
    UpdateComponent,
    SearchComponent
  ],
  imports: [
   BrowserModule,
    AppRoutingModule,
     HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

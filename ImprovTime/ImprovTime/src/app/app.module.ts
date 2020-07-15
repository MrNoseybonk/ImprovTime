import { BrowserModule } from '@angular/platform-browser';
import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { ImprovComponent } from './Components/improv/improv.component';
import { MainNavBarComponent } from './Components/main-nav-bar/main-nav-bar.component';
import { HttpClientModule } from '@angular/common/http';
import { NewideasComponent } from './Components/newideas/newideas.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ImprovComponent,
    MainNavBarComponent,
    NewideasComponent
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

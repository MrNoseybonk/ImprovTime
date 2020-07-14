import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { ImprovComponent } from './Components/improv/improv.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'improv', component: ImprovComponent },
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

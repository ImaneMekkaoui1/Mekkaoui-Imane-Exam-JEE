import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from './components/navbar/navbar';
import { VehiculeListComponent } from './components/vehicule-list/vehicule-list';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Navbar, VehiculeListComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('FontendJee');
}

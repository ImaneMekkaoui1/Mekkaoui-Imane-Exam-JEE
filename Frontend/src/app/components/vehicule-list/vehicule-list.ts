import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VehiculeService } from '../../services/vehicule';
import { catchError, Observable, throwError } from 'rxjs';

@Component({
  selector: 'app-vehicule-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './vehicule-list.html',
  styleUrl: './vehicule-list.css'
})
export class VehiculeListComponent implements OnInit {
  vehicules$!: Observable<any[]>;
  errorMessage!: string;

  constructor(private vehiculeService: VehiculeService) {}

  ngOnInit(): void {
    this.handleGetVehicules();
  }

  handleGetVehicules() {
    this.vehicules$ = this.vehiculeService.getVehicules().pipe(
      catchError(err => {
        this.errorMessage = "Erreur de chargement des données";
        return throwError(err);
      })
    );
  }
}
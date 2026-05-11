import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VehiculeService {
  constructor(private http: HttpClient) { }

  public getVehicules(): Observable<any[]> {
    return this.http.get<any[]>(`${environment.backendHost}/api/vehicules`);
  }

  public deleteVehicule(id: number): Observable<any> {
    return this.http.delete(`${environment.backendHost}/api/vehicules/${id}`);
  }
}
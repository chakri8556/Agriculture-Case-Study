import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Farmer {
  constructor(
    public farmerid: number,
    public farmername: string,
    public phoneno: number,
    public farmermailid: string,
    public farmerlocation: string
  ) {}
}
@Component({
  selector: 'app-farmer',
  templateUrl: './farmer.component.html',
  styleUrls: ['./farmer.component.css'],
})
export class FarmerComponent implements OnInit {
  closeResult!: String;
  modalService: any;
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getFarmers();
  }

  farmers: Array<Farmer> = [];
  getFarmers() {
    this.http
      .get<any>('http://localhost:9001/farmer/findAllfarmer')
      .subscribe((response) => {
        console.log(response);
        this.farmers = response;
      });
  }
}

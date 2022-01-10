import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Dealer {
  constructor(
    public dealerid: number,
    public dealername: string,
    public phoneno: number,
    public dealermailid: string
  ) {}
}
@Component({
  selector: 'app-dealer',
  templateUrl: './dealer.component.html',
  styleUrls: ['./dealer.component.css'],
})
export class DealerComponent implements OnInit {
  closeResult!: String;
  modalService: any;
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getDealers();
  }

  dealers: Array<Dealer> = [];
  getDealers() {
    this.http
      .get<any>('http://localhost:9002/dealer/findAlldealer')
      .subscribe((response) => {
        console.log(response);
        this.dealers = response;
      });
  }
}

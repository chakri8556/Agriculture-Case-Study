import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { NgForm } from '@angular/forms';
export class Dealer {
  constructor(
    public dealerid: any,
    public dealername: string,
    public phoneno: any,
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
  constructor(private http: HttpClient, private modalService: NgbModal) {}

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
  open(content: any) {
    this.modalService
      .open(content, { ariaLabelledBy: 'modal-basic-title' })
      .result.then(
        (result) => {
          this.closeResult = `Closed with: ${result}`;
        },
        (reason) => {
          this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
        }
      );
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }
  onSubmit(f: NgForm) {
    const url = 'http://localhost:9002/dealer/adddealer';
    this.http.post(url, f.value).subscribe((result: any) => {
      this.ngOnInit(); //reload the table
    });
    this.modalService.dismissAll(); //dismiss the modal
  }
  openDetails(targetModal: any, dealer: Dealer) {
    this.modalService.open(targetModal, {
      centered: true,
      backdrop: 'static',
      size: 'lg',
    });
    document.getElementById('did')?.setAttribute('value', dealer.dealerid);
    document.getElementById('dname')?.setAttribute('value', dealer.dealername);
    document.getElementById('phno')?.setAttribute('value', dealer.phoneno);
    document
      .getElementById('dmailid')
      ?.setAttribute('value', dealer.dealermailid);
  }
}

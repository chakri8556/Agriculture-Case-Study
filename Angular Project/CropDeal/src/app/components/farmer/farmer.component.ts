import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { NgForm } from '@angular/forms';
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
  constructor(private http: HttpClient, private modalService: NgbModal) {}

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
    const url = 'http://localhost:9001/farmer/addfarmer';
    this.http.post(url, f.value).subscribe((result: any) => {
      this.ngOnInit(); //reload the table
    });
    this.modalService.dismissAll(); //dismiss the modal
  }
}

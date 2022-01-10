import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { NgForm } from '@angular/forms';
export class Crop {
  constructor(
    public cropid: any,
    public cropname: string,
    public cropprice: any,
    public quantity: any
  ) {}
}
@Component({
  selector: 'app-crop',
  templateUrl: './crop.component.html',
  styleUrls: ['./crop.component.css'],
})
export class CropComponent implements OnInit {
  closeResult!: String;
  constructor(private http: HttpClient, private modalService: NgbModal) {}
  ngOnInit(): void {
    this.getCrops();
  }
  crops: Array<Crop> = [];
  getCrops() {
    this.http
      .get<any>('http://localhost:9004/crop/findAllcrop')
      .subscribe((response) => {
        console.log(response);
        this.crops = response;
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
    const url = 'http://localhost:9004/crop/addcrop';
    this.http.post(url, f.value).subscribe((result: any) => {
      this.ngOnInit(); //reload the table
    });
    this.modalService.dismissAll(); //dismiss the modal
  }
  openDetails(targetModal: any, crop: Crop) {
    this.modalService.open(targetModal, {
      centered: true,
      backdrop: 'static',
      size: 'lg',
    });
    document.getElementById('cid')?.setAttribute('value', crop.cropid);
    document.getElementById('cname')?.setAttribute('value', crop.cropname);
    document.getElementById('cprice')?.setAttribute('value', crop.cropprice);
    document.getElementById('quant')?.setAttribute('value', crop.quantity);
  }
}

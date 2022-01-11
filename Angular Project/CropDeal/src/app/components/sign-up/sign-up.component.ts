import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css'],
})
export class SignUpComponent implements OnInit {
  constructor(private as: AuthenticationService) {}

  ngOnInit(): void {}

  dataCapture(form: { value: { semail: any; pass: any } }) {
    console.log(form.value.semail);
    console.log(form.value.pass);
  }
}

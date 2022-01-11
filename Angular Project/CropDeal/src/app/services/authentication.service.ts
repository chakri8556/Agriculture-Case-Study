import { Injectable } from '@angular/core';
import { AngularFireAuth } from '@angular/fire/compat/auth';

@Injectable({
  providedIn: 'root',
})
export class AuthenticationService {
  constructor(private fauth: AngularFireAuth) {}

  signUp(email: string, password: string) {
    return this.fauth.createUserWithEmailAndPassword(email, password);
  }
}

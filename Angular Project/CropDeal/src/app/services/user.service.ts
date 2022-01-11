import { Injectable } from '@angular/core';
import { AngularFirestore } from '@angular/fire/compat/firestore';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private as: AngularFirestore) {}

  addNewUser(id: any, name: String, password: any) {
    return this.as.doc('user/' + id).set({
      name,
      password,
    });
  }
}

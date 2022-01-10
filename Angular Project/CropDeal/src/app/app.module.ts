import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AngularFireModule } from '@angular/fire/compat';
import { AngularFirestore } from '@angular/fire/compat/firestore';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { LogoutComponent } from './components/logout/logout.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { HttpClientModule } from '@angular/common/http';
import { DealerComponent } from './components/dealer/dealer.component';
import { AdminComponent } from './components/admin/admin.component';
import { FarmerComponent } from './components/farmer/farmer.component';
import { CropComponent } from './components/crop/crop.component';
import { SFarmerComponent } from './sfarmer/sfarmer.component';
import { SDealerComponent } from './sdealer/sdealer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    SignUpComponent,
    LogoutComponent,
    NavbarComponent,
    NotFoundComponent,
    DealerComponent,
    AdminComponent,
    FarmerComponent,
    CropComponent,
    SFarmerComponent,
    SDealerComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AngularFireModule.initializeApp({
      apiKey: 'AIzaSyA8msxY-3vihn1qYC1RgdFTu8qNEgC5D-Y',
      authDomain: 'cropdeal-2c6df.firebaseapp.com',
      projectId: 'cropdeal-2c6df',
      storageBucket: 'cropdeal-2c6df.appspot.com',
      messagingSenderId: '311941162182',
      appId: '1:311941162182:web:0c3c99d6fa19984a5f23c7',
      measurementId: 'G-BQKKGC14JV',
    }),
  ],
  providers: [AngularFirestore],

  bootstrap: [AppComponent],
})
export class AppModule {}

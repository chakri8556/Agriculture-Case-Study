import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { AdminComponent } from './components/admin/admin.component';
import { SFarmerComponent } from './sfarmer/sfarmer.component';
import { SDealerComponent } from './sdealer/sdealer.component';
import { FarmerComponent } from './components/farmer/farmer.component';
import { DealerComponent } from './components/dealer/dealer.component';
import { CropComponent } from './components/crop/crop.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent },
  { path: 'navbar', component: NavbarComponent },
  { path: 'signup', component: SignUpComponent },
  { path: 'sfarmer', component: SFarmerComponent },
  { path: 'sdealer', component: SDealerComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'farmer', component: FarmerComponent },
  { path: 'dealer', component: DealerComponent },
  { path: 'crops', component: CropComponent },
  { path: '**', component: NotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

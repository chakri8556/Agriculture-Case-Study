import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/Interface/products.interface';
import { ProductsService } from 'src/app/products.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  Product: Array<any> = [];

  constructor(private ps: ProductsService) {}

  ngOnInit() {
    this.ps.getAllProducts().subscribe((data) => (this.Product = data));
  }
}

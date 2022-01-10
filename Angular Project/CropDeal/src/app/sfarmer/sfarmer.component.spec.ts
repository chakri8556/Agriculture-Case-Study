import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SFarmerComponent } from './sfarmer.component';

describe('SFarmerComponent', () => {
  let component: SFarmerComponent;
  let fixture: ComponentFixture<SFarmerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SFarmerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SFarmerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

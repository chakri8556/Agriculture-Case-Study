import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SDealerComponent } from './sdealer.component';

describe('SDealerComponent', () => {
  let component: SDealerComponent;
  let fixture: ComponentFixture<SDealerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SDealerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SDealerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

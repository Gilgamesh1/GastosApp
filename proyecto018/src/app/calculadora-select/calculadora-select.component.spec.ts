import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculadoraSelectComponent } from './calculadora-select.component';

describe('CalculadoraSelectComponent', () => {
  let component: CalculadoraSelectComponent;
  let fixture: ComponentFixture<CalculadoraSelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculadoraSelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculadoraSelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

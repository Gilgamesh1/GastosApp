import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculadoraCheckComponent } from './calculadora-check.component';

describe('CalculadoraCheckComponent', () => {
  let component: CalculadoraCheckComponent;
  let fixture: ComponentFixture<CalculadoraCheckComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculadoraCheckComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculadoraCheckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

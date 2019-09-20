import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ElemDadoComponent } from './elem-dado.component';

describe('ElemDadoComponent', () => {
  let component: ElemDadoComponent;
  let fixture: ComponentFixture<ElemDadoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ElemDadoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ElemDadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

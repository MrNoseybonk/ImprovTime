import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewideasComponent } from './newideas.component';

describe('NewideasComponent', () => {
  let component: NewideasComponent;
  let fixture: ComponentFixture<NewideasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewideasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewideasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

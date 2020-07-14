import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ImprovComponent } from './improv.component';

describe('ImprovComponent', () => {
  let component: ImprovComponent;
  let fixture: ComponentFixture<ImprovComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ImprovComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ImprovComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { ImprovService } from './improv.service';

describe('ImprovServiceService', () => {
  let service: ImprovService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ImprovService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

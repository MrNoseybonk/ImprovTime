import { TestBed } from '@angular/core/testing';

import { NewideasService } from './newideas.service';

describe('NewideasService', () => {
  let service: NewideasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NewideasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { BasicauthenticationService } from './basicauthentication.service';

describe('BasicauthenticationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BasicauthenticationService = TestBed.get(BasicauthenticationService);
    expect(service).toBeTruthy();
  });
});

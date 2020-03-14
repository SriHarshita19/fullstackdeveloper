import { TestBed } from '@angular/core/testing';

import { BlogDadaService } from './blog-dada.service';

describe('BlogDadaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BlogDadaService = TestBed.get(BlogDadaService);
    expect(service).toBeTruthy();
  });
});

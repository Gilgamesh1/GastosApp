import { TestBed } from '@angular/core/testing';

import { ArticulosWebService } from './articulos-web.service';

describe('ArticulosWebService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ArticulosWebService = TestBed.get(ArticulosWebService);
    expect(service).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { AdvertisementFormService } from './advertisement-form.service';

describe('AdvertisementFormService', () => {
  let service: AdvertisementFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdvertisementFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

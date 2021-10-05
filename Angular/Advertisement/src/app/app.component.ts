import { Component } from '@angular/core';
import { FormGroup, FormControl, FormArray } from '@angular/forms';
import { Advertisement } from './model/advertisement.model';
import { AdvertisementFormService } from './service/advertisement-form.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public data:Advertisement[]=[]; 
  dtOptions: DataTables.Settings = {};
  constructor(private adformService:AdvertisementFormService){}
  ngOnInit() {
    this.getList();
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 5,
      processing: true,
      lengthMenu:[[5,10,20,25,50,-1],[5,10,20,25,50,"All"]]
    };
  }

  getList() {
      this.adformService.getAds().subscribe(data => {
        this.data=data;
        console.log(this.data);
    });
  }

}

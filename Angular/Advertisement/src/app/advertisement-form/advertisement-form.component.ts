import { Component, OnInit } from '@angular/core';
import { Advertisement } from '../model/advertisement.model';
import { AdvertisementFormService } from '../service/advertisement-form.service';

@Component({
  selector: 'app-advertisement-form',
  templateUrl: './advertisement-form.component.html',
  styleUrls: ['./advertisement-form.component.css']
})
export class AdvertisementFormComponent implements OnInit {

  constructor(private adformService:AdvertisementFormService){}

  ngOnInit(): void {
  }
  submit(form:any){
    let ad:Advertisement;
    ad=form;
    this.adformService.createAdvertisement(ad).subscribe(data=>{
      console.log(data);
      this.getList();
      this.getAd(data.id);
    });
  }

  getList() {
    this.adformService.getAds().subscribe(data => {
      console.log(data);
  });
  }

  getAd(id:number) {
    let ad:Advertisement;
    this.adformService.getAd(id).subscribe(data => {
        console.log("Printing id data"+data);

    });
  }
}

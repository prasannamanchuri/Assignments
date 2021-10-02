import { Component, OnInit } from '@angular/core';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {
  restaurantMap:string[]=[];
  dtOptions: DataTables.Settings = {};
  closeResult:string="";
  restaurantName:string="";
  constructor(private modalService:NgbModal) { }

  ngOnInit(): void {
    this.restaurantMap.push("Restaurant1");
    this.restaurantMap.push("Restaurant2");
    this.restaurantMap.push("Restaurant3");
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 5,
      processing: true,
      lengthMenu:[[5,10,20,25,50,-1],[5,10,20,25,50,"All"]]
    };
  }

  open(content:any) {
    this.modalService.open(content,{ariaLabelledBy:'modal-title'}).result.then((result)=>{
      this.closeResult=`Closed with ${result}`;
    },(reason)=>{
      this.closeResult=`Dismissed ${this.getDismissReason(reason)}`;
    })
  }

  getDismissReason(reason:any):string{
    if(reason===ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if(reason===ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

  addRestaurant(){
    this.restaurantMap.push(this.restaurantName);
    this.modalService.dismissAll();
  }
}

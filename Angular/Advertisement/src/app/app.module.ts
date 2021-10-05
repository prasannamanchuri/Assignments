import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {DataTablesModule} from 'angular-datatables';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdvertisementFormComponent } from './advertisement-form/advertisement-form.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { DataService } from './service/data.service';
   

@NgModule({
  declarations: [
    AppComponent,
    AdvertisementFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DataTablesModule,
    FormsModule,
    HttpClientModule,
    HttpClientInMemoryWebApiModule.forRoot(DataService),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
 
function InMemoryDataService(InMemoryDataService: any, arg1: { dataEncapsulation: true; }): any[] | import("@angular/core").Type<any> | import("@angular/core").ModuleWithProviders<{}> {
  throw new Error('Function not implemented.');
}


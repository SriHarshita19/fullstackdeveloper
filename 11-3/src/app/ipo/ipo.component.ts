import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IpoService } from '../ipo.service';

@Component({
  selector: 'app-ipo',
  templateUrl: './ipo.component.html',
  styleUrls: ['./ipo.component.css']
})
export class IpoComponent implements OnInit {

    constructor(private formBuilder:FormBuilder,private iposerv:IpoService) { }
    ipoForm:FormGroup;
    ngOnInit() {
      this.ipoForm = this.formBuilder.group({
        id:['',Validators.required],
        companyname:['',Validators.required],
        stockexchange:['',Validators.required],
        price:['',Validators.required],
        shares:['',Validators.required],
        opendatetime:['',Validators.required],
        remarks:['',Validators.required]
        
      });
    }
    adduser(){
      this.iposerv.saveIPO(this.ipoForm.value).subscribe(data =>{
        console.log('ipo entered successfully');
      });
    }
    onSubmit(){
      console.log(this.ipoForm.value);
    }
  
  }

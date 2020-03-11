import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { IpoService } from '../ipo.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updateipo',
  templateUrl: './updateipo.component.html',
  styleUrls: ['./updateipo.component.css']
})


 export class UpdateipoComponent implements OnInit {
    updateIPO:FormGroup;
      constructor(private formBuilder:FormBuilder, private iposervice: IpoService,private router:Router) { }
    
      ngOnInit() {
        this.updateIPO = this.formBuilder.group({
          id:[],
          companyname:['',Validators.required],
          stockexchange:['',Validators.required],
          price:['',Validators.required],
          shares:['',Validators.required],
          opendatetime:['',Validators.required],
          remarks:['',Validators.required]
          
    
        });
        const id=localStorage.getItem("ipoId");
        if(+id > 0){
          this.iposervice.getIPOById(+id).subscribe(ipos =>{
            this.updateIPO.patchValue(ipos);
          });
      }
    
    }
    updateTheIPO(){
      this.iposervice.updateIPOInfo(this.updateIPO.value).subscribe(u=>{
    this.router.navigate(['/ipoadd']);
      })
    }
    onSubmit(){
      console.log(this.updateIPO.value );
    
      }
    
    }
import { Component, OnInit } from '@angular/core';
import { UploadserviceService } from '../uploadservice.service';
@Component({
  selector: 'app-import',
  templateUrl: './import.component.html',
  styleUrls: ['./import.component.css']
})
export class ImportComponent implements OnInit {
file: File;
isError:boolean=false;
errorMessage:string="";
  constructor(private uploadService:UploadserviceService) { }
  ngOnInit() {
  }
  onFileChange(e){
    this.file=e.target.files[0];
  }
  uploadData(){
    const uploadSheetData=new FormData();
    uploadSheetData.append("stocksSheet",this.file,this.file.name);
    this.uploadService.uploadStocksSheet(uploadSheetData).subscribe(
      data=>{
        console.log("uploaded");
      }
    );
  }
}
// import { Component, OnInit } from '@angular/core';
// import { FormGroup, FormControl, Validators } from '@angular/forms';
// import { UploadserviceService } from '../uploadservice.service';
// @Component({
//   selector: 'app-import',
//   templateUrl: './import.component.html',
//   styleUrls: ['./import.component.css']
// })
// export class ImportComponent implements OnInit {
// file:File;
// ImportData:FormGroup;
// // isError:boolean=false;
// // errorMessage:string="";
//   constructor(private uploadService:UploadserviceService) { }

//   ngOnInit() {
//     this.ImportData=new FormGroup({
//       excelFileUpload:new FormControl("",[Validators.required])
//     });
//   }
// onFileChange(e){
//   this.file=e.target.files[0];
// }
// uploadData(){
//   const uploadSheetData=new FormData();
//   uploadSheetData.append("stocksSheet",this.file,this.file.name);
//   this.uploadService.uploadStocksSheet(uploadSheetData).subscribe(
//     data=>{
//       console.log("Uploaded");
//     }
//   )
// }
// }

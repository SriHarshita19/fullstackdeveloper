import { Component, OnInit } from '@angular/core';
import * as Highcharts from 'highcharts';

import { ActivatedRoute } from '@angular/router';
import { UploadserviceService } from '../uploadservice.service';
@Component({
  selector: 'app-highcharts',
  templateUrl: './highcharts.component.html',
  styleUrls: ['./highcharts.component.css']
})
export class HighchartsComponent implements OnInit {
    compareData: any;
    constructor(private uploadService: UploadserviceService, private route: ActivatedRoute) { }
    chartOne = Highcharts;
    chartOneOptions: any;
    getFirstDataComplete: boolean = false;
    getSecondDataComplete: boolean = false;
    ngOnInit() {
       this.compareData = JSON.parse(this.route.snapshot.queryParams.formData);
        let series: any = []
            let categories: any[] = [];
            this.uploadService.getCompanyStockPricesBetween(this.compareData.cnsn, this.compareData.seselect, this.compareData.fperiod, this.compareData.tperiod).subscribe(data => {
                let companyOneData: any[] = [];
                 console.log(companyOneData)
                data.forEach((stockPrice) => {
                    categories.push(stockPrice.dataPoint);
                    companyOneData.push(stockPrice.dataValue)
                })
                let seriesDataMemberOne = {
                    name: this.compareData.cnsn + " (" + this.compareData.seselect + ")",
                    data: companyOneData
                }
                series[0] = seriesDataMemberOne;
                setTimeout(()=>{
                   this.getFirstDataComplete = true;
                },2000);
                this.uploadService.getCompanyStockPricesBetween(this.compareData.ctcnsn, this.compareData.seselect, this.compareData.fperiod, this.compareData.tperiod).subscribe(data => {
                let companyTwoData: any[] = [];
                data.forEach((stockPrice) => {
                    if (categories.includes(stockPrice.dataPoint)) {
                        companyTwoData.push(stockPrice.dataValue)
                    }
                })
                let seriesDataMemberTwo = {
                    name: this.compareData.ctcnsn + " (" + this.compareData.seselect + ")",
                    data: companyTwoData
                }
                series[1] = seriesDataMemberTwo;
                setTimeout(()=>{
                   this.getSecondDataComplete = true;
                },2000)
            });
            this.chartOneOptions = {
                chart: {
                    type: "column"
                },
                title: {
                    text: "Stock Comparision Chart"
                },
                xAxis: {
                    categories: categories
                },
                yAxis: {
                    title: {
                        text: "Stock Price"
                    }
                },
                series: series
            }
            });
        }
    }
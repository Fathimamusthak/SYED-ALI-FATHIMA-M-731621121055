import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
//   name:string;
//   age:number;
//   email:string;
//   imagePath:string;
//   fname:string;

//   constructor(){
//     this.name="Agila";
//     this.age=20;
//     this.email="agila@gmail.com";
//     this.imagePath="./assets/Ang1.png";
//     this.fname=" ";
//   }
//   change(){
//     this.name="vijay";
//   }
//   changeImage(){
//     this.imagePath="./assets/Ang1.png";
//   }
// }


  //flag:boolean;
  //vehicles:string[];
  //selectedVehicle:string;
  //myStyle:{};
  //myClass:string;

  //constructor(){
   // this.flag=true;
   // this.vehicles=["Two Wheeler","Three Wheeler","Four Wheeler"];
   //this.selectedVehicle="";
    //this.myStyle={'width':'40%','border':'2px solid green','border-radius':'15px'};
    //this.myClass="myClass1";
 // }
  /*changeFlag(){
    this.flag=!this.flag;
    
  }
  setSelectedItem(vec:string){
    this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle={'width':'40%','border':'2px solid red','border-radius':'15px'};
  
  }
  }*/
 sum : number;
 sub : number;
 constructor(private calc : CalculatorService){
this.sum = calc.getAddition(10,20);
this.sub = calc.getSubtraction(20,10);
 }
}
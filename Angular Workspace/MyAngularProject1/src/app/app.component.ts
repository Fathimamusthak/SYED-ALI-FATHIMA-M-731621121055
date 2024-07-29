import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
name: string;
age: number;
email: string;
imagePath : string;

constructor(){
this.name = "saf";
this.age = 38;
this.email = "fathima@gmail.com";
this.imagePath ="./assets/ang.png";
}
changeName(){
  this.name="Vijay";
}
changeImage(){
  this.imagePath = "./assets/ang1.png";

}
}

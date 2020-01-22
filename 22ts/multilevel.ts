class Animal {   
    eat():void {   
        console.log("Eating")   
     }   
}   
class Dog extends Animal {   
   bark():void {   
      console.log("Barking")   
   }   
}  
class BabyDog extends Dog{   
    weep():void {   
        console.log("Weeping")   
     }  
}  
let obj = new BabyDog();   
obj.eat();  
obj.bark();  
obj.weep()  
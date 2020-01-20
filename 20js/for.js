//for
var num = 5 ;
var factorial = 1; 
for( let i = num ; i >= 1; i-- ) { 
   factorial *= i ; 
} 
console.log(factorial);

//for..in
var obj = {a:1, b:2, c:3};  
for (var prop in obj) { 
   console.log(obj[prop]); 
}

//for..of
for (let val of[12 , 13 , 123]) {   
   console.log(val) 
} 
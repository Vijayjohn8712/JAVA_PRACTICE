// console.log(typeof(NaN));
// console.log(isNaN('NaN'));

// console.log(isNaN(""));
// console.log(isNaN(null));
// console.log(isNaN("123"));
// console.log(isNaN("vijay"));
// console.log(isNaN(undefined));

// console.log(isNaN(123));
// console.log(isNaN(-1.23));
// console.log(isNaN(5-2));
// console.log(isNaN(0));

// console.log(isNaN('123'));
// console.log(isNaN('Hello'));
// console.log(isNaN('2005/12/12'));

// console.log(Number.isNaN('Hello'));
// console.log(Number.isNaN(123));

// console.log(parseFloat(10));
// console.log(parseFloat("10"));
// console.log(parseFloat("10.33"));
// console.log(parseFloat("34 45 66"));
// console.log(parseFloat("He was 40"));
// console.log(parseFloat("40.00"));
// console.log(parseFloat(" 40 "));
// console.log(parseFloat("40 years"));
// console.log(parseFloat("40H"));
// console.log(parseFloat("H40"));


// console.log(Number(34, 45, 66));
// console.log(Number('vijay'));
// console.log(Number('34,65,45'));
// console.log(Number("He was 40" ));

// console.log(parseInt("10"));
// console.log(parseInt("10.00"));
// console.log(parseInt("10.33"));
// console.log(parseInt("34 45 66"));
// console.log(parseInt(" 60 "));
// console.log(parseInt("40 years"));
// console.log(parseInt("He was 40"));
// console.log(parseInt("10", 10));
// console.log(parseInt("011"));
// console.log(parseInt(10 ,8));
// console.log(parseInt("0x10"));
// console.log(parseFloat(10, '16'));


// console.log(String(new Date()));
// console.log(String("12345"));
// console.log(String(12345));


//UNDEFINDED:
// let x;
// if (x === undefined) {
//  console.log("x is undefined") 
// } else {
//     console.log("x is defined") 
// }

// let x;
// if (typeof x === undefined) {
//  console.log("x is undefined") 
// } else {
//     console.log("x is defined") 
    
//  console.log(typeof x);
// }

// NUMBER.NaN:
// console.log(Number.isNaN(123));
// console.log(Number.isNaN(-1.23));
// console.log(Number.isNaN('123'));

// console.log(Number.isNaN(0/0));
// console.log(Number.isNaN(false));
// console.log(Number.isNaN(true));
// console.log(Number.isNaN(undefined));
// console.log(Number.isNaN('NaN'));


// console.log(Number.isNaN(5-2));
// console.log(Number.isNaN(0));
// console.log(Number.isNaN('Hello'));
// console.log(Number.isNaN('2005/12/12'));
// // console.log(Number.isNaN(' '));

// console.log(Number.isSafeInteger(123));
// console.log(Number.isSafeInteger('123'));
// console.log(Number.isSafeInteger(-123));

// console.log(Number.isSafeInteger(5-2));
// console.log(Number.isSafeInteger(0));
// console.log(Number.isSafeInteger(0.5));
// console.log(Number.isSafeInteger(0/0));

// console.log(Number.isSafeInteger(true));
// console.log(Number.isSafeInteger(false));
// console.log(Number.isSafeInteger(Infinity));
// console.log(Number.isSafeInteger(-Infinity));
// console.log(Number.isSafeInteger(Math.pow(2, 53)));
// console.log(Number.isSafeInteger(Math.pow(2, 53) - 1));

// let x = 100;
// // console.log(x.MAX_SAFE_INTEGER);

// let x = 100;
// // console.log( x = Number.POSITIVE_INFINITY);
// let n=10;
// console.log(n = (Number.MAX_VALUE) * 2);

//  PROTOTYPE METHORD:

// Number.prototype.Method = function() {
//     return this.valueOf() /2;
//   };

//   n=10;
//   console.log(n.Method())

// function Person(first, last, age, eyecolor) {
//     this.firstName = first;
//     this.lastName = last;
//     this.eyeColor = eyecolor;
//   }

//   console.log(Person.prototype.nationality = "English");
//   console.log(Person.nationality);
  

// let num = 1000000;
// console.log(num.toLocaleString("en-US", {style:"currency", currency:"USD"}));

// let num = 13.3714;
// console.log(num.toPrecision(4));

// let num = 15;
// console.log(num.toString(16));

let num = 19;
console.log(num.valueOf());
//block of code
//var is global scope and function scope
//let is gloal scope, function scope and block scope
//let and const are introduced in ES6
//const is block scope and function scope but it is not global scope
const name="Nijam"
// name="khan" // This will throw an error
let msg="Hello"
msg="Hi"
if(true){
    let msg="Welcome"
    console.log(msg)
}

var greet="Good Morning"
if(true){
    var greet="Good Afternoon"
    console.log(greet)
}

function add(a,b){
    let msg="Home"
    var greet="Good Evening"
    console.log(greet)
    return a+b
}
let sum=add(2,3)
console.log(sum)

//do not have name=> annonymous function    
let addAnonymous=(c,d)=>c+d
console.log(addAnonymous(7,3))
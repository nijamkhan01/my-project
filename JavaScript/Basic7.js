module.exports=class Person 
{
    age =24
    get location(){
        return "kolkata"
    }
    //consutructor is method which is called when we create object of class
    constructor(name,title){
        console.log("constructor is called")
        this.name = name
        this.title = title
    }  
    
    fullName(){
        console.log(this.name+" "+this.title)
    }
}

let person1 = new Person("Nijam","Khan")
let person2 = new Person("Tumpa","bibi")
console.log(person1.age)
console.log(person1.location)
person1.fullName()
person2.fullName()
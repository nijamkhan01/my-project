const Person = require('./Basic7.js')
class Pet extends Person{

    getLocation(){
        return "Mumbai"
    }
    constructor(name,title){        
        super(name,title) // call the constructor of parent class
    }
} 
let pet1 = new Pet("Buddy", "Dog")
console.log(pet1.fullName())
console.log(pet1.getLocation())
//object is collection properties
let person = {
    name: "Nijam",
    title:"Khan",
    age: 24,
    fullname: function(){
        return this.name+" "+this.title
    }    
}
console.log(person.age)
console.log(person.fullname())

person.age=25
console.log(person.age)

person.gender='male'
console.log(person.gender)
delete person.age
console.log(person)
console.log(person.age)

for(let key in person){
    console.log(key)
    console.log(person[key])
}
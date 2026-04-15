const Person=require('./Basic7.js')
let day='tuesday '
console.log(day.length)
let subString=day.slice(0,3)
console.log(subString)
console.log(day[0])
let splitDay=day.split('s')
console.log(splitDay[1].trim())
console.log(splitDay[1].length)

let date='25'
let date1='27'

let sum=parseInt(date)+parseInt(date1)
console.log(sum)
let str=sum.toString()
console.log(typeof(str))

let newQuote=day.trim()+" is a good day"
console.log(newQuote)
console.log(newQuote.indexOf('day',5))

let val=newQuote.indexOf('day')
let count=0
while(val!==-1){
    count++
    val=newQuote.indexOf('day',val+1)
}
console.log(count)

let person3=new Person("Priti","Karmakar")
console.log(person3.fullName())


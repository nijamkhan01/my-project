var marks1=Array(6)
var marks1=new Array(10,20,30,40,50,60)
var marks1=[15,25,35,45,65,75]

console.log(marks1[0])
marks1[1]=37
console.log(marks1[1])
console.log(marks1)
console.log(marks1.length)
marks1.push(85)
console.log(marks1)
marks1.pop(85)
console.log(marks1)
marks1.unshift(12)
console.log(marks1)
console.log(marks1.indexOf(45))
console.log(marks1.includes(120))
console.log(marks1.slice(2,5))

var sum=0
for(let i=0;i<marks1.length;i++){
    sum+=marks1[i]
   // console.log(marks1[i])
   
}
console.log(sum)

console.log("**********+#######")

let total=marks1.reduce((sum,marks3)=>sum+marks3,0)
console.log(total)

var scores=[12,13,14,15,16]
var evenScore=[]
for(let i=0;i<scores.length;i++){
    if(scores[i]%2==0){
        evenScore.push(scores[i])
    }
}
console.log(evenScore)

var newEvenScores=scores.filter(scores=>scores%2==0)
console.log(newEvenScores)

//map
let mappedArray=newEvenScores.map(scores=>scores*3)
console.log(mappedArray)
let totalVal=mappedArray.reduce((sum,val)=>sum+val,0)
console.log(totalVal)

var score1=[12,13,14,15,16]

let sumVal=score1.filter(scores=>scores%2==0).map(scores=>scores*3).reduce((sum,val)=>sum+val,0)
console.log(sumVal)

let fruites=["apple","grapes","banana","orange"]
let newFruites=fruites.map(fruit=>fruit.toUpperCase())
newFruites.sort()
console.log(newFruites)
console.log(newFruites.reverse())
console.log(newEvenScores.sort((a,b)=>b-a))//descending order

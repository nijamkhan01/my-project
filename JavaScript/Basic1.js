const flag=true
if(!flag){
console.log("condition satisfied")
}else{
    console.log(flag)
console.log("condition not satisfied")
}

let i=0;

while(i<10){
    i++
console.log(i)
}

do{
i++
}while(i<10);
    console.log(i)
//2 and 5
//from 1 to 10 give me common multiple of 2 and 5
console.log("************")
let n=0
for(let j=1;j<=100;j++){
if(j%2==0 && j%5==0){
    n++
    console.log(j)
    if(n==3)
{
    break
}
    }
}

    let required=true
    while(required){
        console.log(required)
        required=false
    }
const  listArm=[0,1,153,370,371,407,1634, 8208];
const iterator = listArm[Symbol.iterator]();
function getNextArmstrong(){
  if(iterator.next().value>1000){
    return "error"
  }
  else{
    
    return {
        "next value" : iterator.next().value
    }
}
}
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());

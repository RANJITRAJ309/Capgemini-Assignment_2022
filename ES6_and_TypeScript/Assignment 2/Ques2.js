const  listArm=[0,1,153,370,371,407];
const iterator = listArm[Symbol.iterator]();
function getNextArmstrong(){
    
    return {
        "next value" : iterator.next().value
    }
}
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());

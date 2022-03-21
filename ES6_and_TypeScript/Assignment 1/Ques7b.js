var organization ={
    name:"ABC",
    address:{
        city:"BG",
        state:"BR",
        pincode:800020 
    }
}

const {address:{city:city1,state:state1,pincode:pincode1}}=organization;

console.log(pincode1);
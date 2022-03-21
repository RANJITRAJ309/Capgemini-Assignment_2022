var Order={
    id:20,
    title:'order',
    price:50,
    printOrder(){
        console.log(this.id+" "+this.title+" "+this.price)
    },
    getPrice(){
        return this.prie;
    }
}

var CopyObject = Object.assign(Order);
console.log(CopyObject)
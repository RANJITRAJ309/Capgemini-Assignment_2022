// generating X
let x = Promise.resolve(
    Math.floor(Math.random() * 10)
)

// generating Y
let y = Promise.resolve(
    Math.floor(Math.random() * 10)
)

// PROMISE.ALL
Promise.all([x,y]).then(values => {
    
    // logging generated values
    console.log(`The generated values : ${values}`);
    
    // logging the sum
    console.log(`Sum : ${values[0] + values[1]}`);
}).catch((message)=>{
    console.log(`Error while processing...`);
})
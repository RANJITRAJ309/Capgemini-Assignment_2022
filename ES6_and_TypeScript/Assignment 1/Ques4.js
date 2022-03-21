let StringArray = ['Tom', 'Ivan', 'Jerry']

 var arrowFunction = (StringArray)=>{
    let resArray=[];
     StringArray.map((ele)=>{
        let object={
            name:"",
            length:0
        };
        object.name=ele;
        object.length= ele.length;
        resArray.push(object);
     })
     return resArray;
 }
 console.log(arrowFunction(StringArray));
function printCapitalNames(name1,name2,name3,name4,name5){
    console.log("TO UPPER CASE: ",[name1.toUpperCase()+" "+name2.toUpperCase()+" "+name3.toUpperCase()+" "+name4.toUpperCase()+" "+name5.toUpperCase()]);
} 

var nameList=["ranjit","kajal","himanshu","someshwar","ravindra"];
printCapitalNames(...nameList);
class Account{
    constructor(id,name,balance){
        this.id=id;
        this.name= name;
        this.balance = balance;
    }
}
class SavingAccount extends Account{
   constructor(id,name,balance,interest){
          super(id,name,balance);
          this.interest  = interest;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance + (this.balance*this.interest);
       return this.totalBalance;
   }
}

class CurrentAccount extends Account{
   constructor(id,name,balance,cash_credit){
          super(id,name,balance);
          this.cash_credit  = cash_credit;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance -this.cash_credit;
       return this.totalBalance;
   }
}

SavingAccountObj = new SavingAccount(001,"Ranjit",10000,15);
console.log(SavingAccountObj.getBalance())

CurrentAccountObj = new CurrentAccount(002,"Raj",15000,1500);
console.log(CurrentAccountObj.getBalance())
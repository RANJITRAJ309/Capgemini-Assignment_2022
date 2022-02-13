import java.util.Scanner;
import javax.naming.InsufficientResourcesException;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String exception){
        super(exception);
    }
}
class IllegalBankTransactionException extends Exception{
    IllegalBankTransactionException(String exception2){
        super(exception2);
    }
}


class  Saving_account{
	double Bal;
	long id;
	public Saving_account(long id,double Bal) {
		this.id=id;
		this.Bal=Bal;
	}
	public void deposit(double deposit) {
		Bal=Bal+deposit;
	}
	public long getID() {
		return id;
	}
	public double getBal() {
		return Bal;
	}
	public void Withdraw(int Withdrawal_amount) throws InsufficientBalanceException,IllegalBankTransactionException{
	
	if(Withdrawal_amount>Bal || Bal==0) {
		throw  new InsufficientBalanceException("Exception");
	}
	else if(Withdrawal_amount<0) {
		throw new IllegalBankTransactionException("Exception");
	}
	else{
		System.out.println("Withdrawn: "+Withdrawal_amount);
		System.out.println(" Remaining Balance: "+(Bal-Withdrawal_amount));
	}
}
}
public class ExceptionHandlingQ3 {
	

	public static void main(String[] args) {
		Saving_account sv=new Saving_account(101,20000);
		System.out.println("Your id: "+sv.getID()+" and your Balance: "+sv.getBal());
		Scanner sc=new Scanner(System.in);
		System.out.print("Amount to  withdraw: ");
		try {
		sv.Withdraw(sc.nextInt());
		}
		catch(InsufficientBalanceException e) {
				System.out.println("You donot have enough balance in your saving account");
				System.out.println(e);
		}
		catch(IllegalBankTransactionException e) {
			System.out.println("you cannot withdraw negative amount");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("something wrong");
			System.out.println(e);
		}
	}

}

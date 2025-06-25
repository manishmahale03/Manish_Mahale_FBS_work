
class BankAccountFinal{
	int accNo;
	String accHolderName;
	double balance;
	double interestRate;
	
	BankAccountFinal() {
		this.accNo = 100;
		this.accHolderName = "not Given";
		this.balance = 0;
		this.interestRate = 0;
	}
	BankAccountFinal(int accNo, String accHolderName, double balance) {
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	int getAccNo() {
		return accNo;
	}
	void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	String getAccHolderName() {
		return accHolderName;
	}
	void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	double getInterestRate() {
		return interestRate;
	}
	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	void display() {
		System.out.println("Account No: " + accNo);
		System.out.println("Account Holder Name: " + accHolderName);
		System.out.println("Current Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate);
	}	
}

public class Java15FinalKeyword {

	public static void main(String[] args) {

		BankAccountFinal b1 = new BankAccountFinal(1001, "Manish", 10000);
		BankAccountFinal b2 = new BankAccountFinal(1002, "Prashant", 16000);
		BankAccountFinal b3 = new BankAccountFinal(1003, "Sonu", 1);
		
		b1.display();
		System.out.println();
		b2.display();
		System.out.println();
		b3.display();
	}

}



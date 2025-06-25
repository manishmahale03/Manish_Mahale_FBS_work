
class BankAccountStatic {
	int accNo;
	String accHolderName;
	double balance;
	static double interestRate;

	static {
		interestRate = interestRate;
	}

	BankAccountStatic() {
		this.accNo = 100;
		this.accHolderName = "not Given";
		this.balance = 0;

	}

	BankAccountStatic(int accNo, String accHolderName, double balance) {
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

	static double getInterestRate() {
		return interestRate;
	}

	static void setInterestRate(double interestRate1) {
		interestRate = interestRate1;
	}

	void display() {
		System.out.println("Account No: " + accNo);
		System.out.println("Account Holder Name: " + accHolderName);
		System.out.println("Current Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate);
	}

}

public class Java16StaticKeyword {

	public static void main(String[] args) {

		BankAccountStatic b1 = new BankAccountStatic(1001, "Manish", 10000);
		BankAccountStatic b2 = new BankAccountStatic(1002, "Prashant", 16000);
		BankAccountStatic b3 = new BankAccountStatic(1003, "Sonu", 1);

		BankAccountStatic.setInterestRate(7.5);

		b1.display();
		System.out.println();
		b2.display();
		System.out.println();
		b3.display();

		System.out.println();
		System.out.println();

		BankAccountStatic.setInterestRate(8.5);

		b2.display();
		System.out.println();
		b3.display();

	}

}

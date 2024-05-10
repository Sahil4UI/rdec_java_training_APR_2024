//inheritance
class Account{
	double blc;
	String acc_no;
	String cust_name;
	void deposit(double amt) //methods
	{
		blc += amt;
	}
	void withDraw(double amt)
	{
		blc -= amt;
	}
	void blcEnquiry()
	{
		System.out.println("Available BLc is : "+blc);
	}
	
	void roi()
	{
		System.out.println("Different Acc have diff ROI");
	}
	void custDetails()
	{
		System.out.println("Name : "+cust_name);
		System.out.println("Acc no : "+acc_no);
		blcEnquiry();
	}
}
class SavingAccount extends Account{
	@Override
	void roi() {
		System.out.println("roi is 6.5%");
	}
	
	void doorToDoor()
	{
		System.out.println("Cash Collection from Home");
	}
}

class CurrentAccount extends Account{
	Double odLimit;
	int noOfTrans = 100;
	void roi()
	{
		System.out.println("Interest charged @ 5.5%");
	}
}
public class IS_A {
	static void CommonCaller(Account account) {
		if (account instanceof SavingAccount)
		{
//			downcasting
			SavingAccount acc = (SavingAccount) account;
			acc.doorToDoor();
		}
		else {
			CurrentAccount acc = (CurrentAccount) account;
		}
	}
	
	public static void main(String[] args) {
//		upcasting and downcasting
		
		CommonCaller(new CurrentAccount());
//		Account savingAccount = new SavingAccount();
//		savingAccount.doorToDoor();
		
		
		
		
		
		// TODO Auto-generated method stub
//		SavingAccount savingAccount = new SavingAccount();
		//object creation of class saving account
//		savingAccount.acc_no="324543234";
//		savingAccount.cust_name = "Lokesh";
//		savingAccount.blc = 15000;
//		
		
//		System.out.println("*********");
//		CurrentAccount currentAccount = new CurrentAccount();
//		currentAccount.acc_no="324543232";
//		currentAccount.cust_name = "Sunny";
//		currentAccount.blc = 150000;

	}

}

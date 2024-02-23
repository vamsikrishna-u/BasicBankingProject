package BankingProject;

public class Checking extends Account{
	int cardPin;
	int debitCard;
	Checking(String name,String ssn,double balance)
	{
		super(name,ssn,balance);
		accountNumber=1+accountNumber;
		setCardDetails();
		//setRate();
		
	}
	private void setCardDetails()
	{
		debitCard=(int)(Math.random()*Math.pow(10, 14));
		cardPin=(int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo()
	{
		System.out.println("Checking Account");
		super.showInfo();
		System.out.println("Debitcard : "+debitCard+
				"\nDebit Card Pin : "+cardPin
				);
	}
	@Override
	public void setRate() {
		 rate=getBaseRate()*.15;
		
		
	}

}

package BankingProject;

public class Savings extends Account{
	int safteyBoxnumber;
	int SafteyBoxPin;

	 Savings(String name,String ssn,double balance)
	{
		super(name,ssn,balance);
		accountNumber=2+accountNumber;
		setSafety();
		//setRate();
	}
	
	@Override
		public void setRate() {
		rate=getBaseRate()-.25;
		
			
		}
	 private void setSafety()
	 {
		 safteyBoxnumber=(int)(Math.random()*Math.pow(10,3));
		 SafteyBoxPin=(int)(Math.random()*Math.pow(10,4));
	 }
	 public void showInfo()
	 {
		 System.out.println("Savings account");
		 super.showInfo();
		 System.out.println("safteyBoxnumber: "+safteyBoxnumber+"\nSafteyBoxPin: "+SafteyBoxPin);
		 
	 }
	

}

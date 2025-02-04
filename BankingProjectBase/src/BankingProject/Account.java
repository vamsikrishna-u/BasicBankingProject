package BankingProject;

public abstract class Account implements IBaseRate 
{
	 String name;
	 String accountNumber;
	 String ssn;
	 static int uniqNum=10000;
	 double balance;
	 double rate;
	

	Account(String name,String ssn,double balance)
	{
		this.name=name;
		this.ssn=ssn;
		this.balance=balance;
		this.accountNumber=accountSet();
		this.setRate();
		
	}
	public void compoundIntrest()
	{
		double compoundIntrest=balance*(rate/100);
		balance=balance+compoundIntrest;
		System.out.println("Compound Intrest : "+compoundIntrest);
		showBalance();
	}
	public void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println(amount+"Depositeed to your Account");
		showBalance();
		
	}
	public void withDraw(int amount)
	{
		balance=balance-amount;
		System.out.println("Withdrawed "+amount);
		showBalance();
	}
	public void transfer(String toWhere,int amount)
	{
		balance=balance-amount;
		System.out.println(amount+" transfered to "+toWhere);
		showBalance();
	}
	public void showBalance()
	{
		System.out.println("Your Balance : $"+balance);
	}
	public abstract void setRate();
	private String accountSet()
	{
		int random= ( int )  ( Math.random()*Math.pow(10, 3));
	String ac=ssn.substring(ssn.length()-2, ssn.length())+uniqNum+random;
	uniqNum++;
	return ac;
	}
	public void showInfo()
	{
		System.out.println("Name: "+name+"\nAccountNumber : "+accountNumber+"\nBalance: "+balance
			+"Baserate is: "+rate	
				);
	}
	
	public void vamsikrishnau() {
		System.out.println("vamsikrishna_u");
	}
	
}

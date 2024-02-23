package BankingProject;

import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		String file="C:\\Users\\RAVITEJA UPPUTOLLA\\Desktop\\Files\\NewBankAccounts.csv";
		List<Account>accounts=new LinkedList<Account>();
		/*
		 * Checking check=new Checking("vamsi krishna","293910100",15000);
		Savings save=new Savings("sathwika pagadam","390125418",25000);
		check.showInfo();
		check.deposit(10000);
		check.withDraw(500); 
		check.transfer("Amazon",3000);
		System.out.println("-------------------------");
		save.showInfo();
		save.compoundIntrest();*/
		List<String[]> newAccountHolders=Utility.Csv.read(file);
		for(String[] acc: newAccountHolders)
		{
			String name=acc[0];
			String ssn=acc[1];
			 String accountType=acc[2];
			 double balance=Double.parseDouble(acc[3]);
			 if(accountType.equals("Savings"))
			 {
				accounts.add(new Savings(name,ssn,balance));
				 
			 }
			 else if(accountType.equalsIgnoreCase("Checking"))
			 {
				accounts.add(new Checking(name,ssn,balance));
				 
			 }
			 else
			 {
				 System.out.println("Error Reading Account Type");
			 }
			 
		}
		//accounts.get(5).showInfo();
		for(Account x:accounts)
		{System.out.println("\n*************************");
			x.showInfo();
			
		}
		
	}

}

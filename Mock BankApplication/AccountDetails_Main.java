package mba;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class AccountDetails_Main {

	public static void main(String[] args) {
		var accountDetails=new HashMap<Long,AccountDetails>();
			Scanner sc=new Scanner(System.in);
			
		System.out.println("Please select the option:\n Y : For creating a new Account\n N : No need to Create a Account");
		     char c;
		     c=sc.next().charAt(0);
		     while(c != 'N') {
		    	 
		    	 if(c=='Y') {		
		    	 AccountDetails account=new AccountDetails();		
		    	 
		    	 
		    	 
				//1. Getting Input for type of Account
				System.out.println("Enter the type of account:\n1.Savings\n2.Current\n");
				int temp;
				temp=sc.nextInt();
				sc.nextLine();
				while(true) {
				if(temp==1) {
					
					account.setAccountType("Savings");
					break;
				}
				else if(temp==2) {
					account.setAccountType("Current");
					break;
				}
				else {
					System.out.println("You have choosen an invalid option");
					System.out.println("_____________________________________________");
					System.out.println("Enter the type of account:\n1.Savings\n2.Current\n");
					temp=sc.nextInt();
				}
				}
			
				
				//2. Input for the Account holder name
				System.out.println("Enter the Account Holder Full Name : ");
				account.setAccountName(sc.nextLine());
				
				
				//3. Input for the Account Number
				System.out.println("Enter the Account Number : ");
				account.setAccountNumber(sc.nextLong());
				
				
				//4. Input for the Amount
				System.out.println("Enter the Amount : ");
				account.setAccountBalance(sc.nextDouble());
				
				
				//5. Input for the currency
				System.out.println("Enter the Currency : ");
				account.setCurrency(sc.next());
			
				
				accountDetails.put(account.getAccountNumber(),account);
		    	 System.out.println("_____________________________________________");
		    	 System.out.println("    ACCOUNT ADDED SUCCESSFULLY  ");
				DisplayDetails(account);
				
				
				
				
				System.out.println("Please select the option:\n Y : For creating a new Account\n N : No need to Create a Account");
				c=sc.next().charAt(0);
		    	 }
		    	 else if((c!='Y')&&(c!='N')) {
			    	 System.out.println("Invalid option choosen");
			    	 System.out.println("_____________________________________________");
			    	 System.out.println("Please select the option:\n Y : For creating a new Account\n N : No need to Create a Account");
						c=sc.next().charAt(0);
			     }
			     }
		     	if(c=='N') {
			    	 System.out.println("Thanks for using our service");
			    	 System.out.println("_____________________________________________");
			     }
			     
				
				
				sc.close();
				int flag=0;
				if(accountDetails.size() > 0) {
					for(Entry<Long, AccountDetails> acc:accountDetails.entrySet()) {
						if(flag==0) {
						   	 System.out.println("_____________________________________________");
						   	 System.out.println("  OVERALL ADDED ACCOUNTS              ");
						   	 flag=1;
							}
						DisplayDetails(acc.getValue());
						
					}
				}

			
			}
	
	public static void DisplayDetails(AccountDetails acc) {
		
		
   	 System.out.println("_____________________________________________");
		System.out.println("Account Type :\t\t"+acc.getAccountType());
		System.out.println("Account Holder Name :\t"+acc.getAccountName());
		System.out.println("Account Number :\t"+acc.getAccountNumber());
		System.out.println("Amount in Account :\t"+acc.getAccountBalance());
		System.out.println("Currency mode :\t\t"+acc.getCurrency());
   	 System.out.println("_____________________________________________");

	}
	
	

	}

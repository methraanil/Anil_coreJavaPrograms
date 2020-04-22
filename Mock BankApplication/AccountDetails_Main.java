package mba;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class AccountDetails_Main {

	public static void main(String[] args) {
		var accountDetails=new HashMap<Long,AccountDetails>();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("*******MOCK BANK APPLICATION******\n\n");
			
		System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nD: Delete an account\nN: Close this Screen");
		     char c;
		     c=sc.next().charAt(0);
		     while(c != 'N') {
		    	 
		    	 if(c=='Y') {		
		    	 AccountDetails account=new AccountDetails();		
		    	 
		    	 
		    	 
  //__________________________________________________________________________________
		    	 
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
				
				
				
				
	//__________________________________________________________________________________
		
				
				//2. Input for the Account holder name
				while(true) {
					
					System.out.println("Enter the Account Holder Full Name : ");
					String name;
					String pattern="^[ a-zA-Z]+$";
					name=sc.nextLine();
					if(((name.length())!=0)&&(name.matches(pattern))) {
					account.setAccountName(name);
					break;
					}
					else {
							System.out.println("*****ENTER VALID NAME*****\n");
					}
					}
					
				
				
				
				
   //__________________________________________________________________________________

				//3. Input for the Account Number
				while(true) {
					System.out.println("Enter account number: ");
					String accnum=sc.nextLine();
					if((accnum!=null)&&(accnum.length()>=10)) {
						try {
							account.setAccountNumber(Long.parseLong(accnum));
							break;
						}
						catch(NumberFormatException e) {
							System.out.println("*****PLEASE ENTER NUMERIC VALUES ONLY*****\n");
						}
					}
			
					else {
						System.out.println("*****ENTER VALID ACCOUNT NUMBER GREATER THAN 10 DIGITS*****\n");
						
					}
				
				}
				
				
  //__________________________________________________________________________________
	
				
				//4. Input for the Amount
				while(true) {
				System.out.println("Enter the Amount : ");
				//account.setAccountBalance(sc.nextDouble());
				String amt=sc.nextLine();
				if(amt!=null) {
					try {
					account.setAccountBalance(Double.parseDouble(amt));
					break;
				}
					catch(NumberFormatException e) {
						System.out.println("*****PLEASE ENTER NUMERIC VALUES ONLY*****\n");
					}
					
							}
				else {
					System.out.println("*****PLEASE ENTER A NUMERIC VALUE*****\n");
				}
				}
				
//__________________________________________________________________________________
	
				//5. Input for the currency
				while(true) {
				System.out.println("Enter the Currency : ");
				String cur=sc.nextLine();
				if(cur!=null) {
				account.setCurrency(cur);
				break;
				}
				else {
					System.out.println("*****PLEASE ENTER A CURRENCY*****\n");
				}
				}
//__________________________________________________________________________________
				
				accountDetails.put(account.getAccountNumber(),account);
		    	 System.out.println("_____________________________________________");
		    	 System.out.println("    ACCOUNT ADDED SUCCESSFULLY  ");
				DisplayDetails(account);
				
				
				
				
				System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nD: Delete an account\nN: Close this Screen");
				c=sc.next().charAt(0);
		    	 }
//__________________________________________________________________________________
		    	 

		    	 //Modifying the Account
		    	 else if(c=='E') {
		    		 
				    	 long an;
				    	 System.out.println("Enter the Account Number");
				    	 an=sc.nextLong();
				    	 if(accountDetails.containsKey(an)) {
				    		 AccountDetails details=new AccountDetails();
				    		 details=accountDetails.get(an);
				    				 
				    		 System.out.println("Select the field \n1: Account Type\n2: Full Name\n3: Amount \n4: Currency Type ");
				    		 int i;
				    		 i=sc.nextInt();
				    		 switch(i) {
				    		 case 1:{
				    			 if(details.getAccountType()=="Savings") {
				    				 details.setAccountType("Current");
				    				 System.out.println("*****Account type was updated from Savings to Current*****");
				    				 accountDetails.put(an,details);
				    				 DisplayDetails(details);
				    				 break;
				    			 }
				    			 else {
				    				 details.setAccountType("Savings");
				    				 System.out.println("*****Account type was updated from Current to Savings*****");
				    				 accountDetails.put(an,details);
				    				 DisplayDetails(details);
				    				 break;
				    			 }
				    		 }
				    		 case 2:{
				    			sc.nextLine();
				    			 System.out.println("Enter the full name: ");
				    			 details.setAccountName(sc.nextLine());
				    			 accountDetails.put(an,details);
				    			 System.out.println("*****NAME UPDATED SUCCESSFULLY*****");
			    				 DisplayDetails(details);
				    			 break;
				    			 
				    		 }
				    		 case 3:{
				    			 System.out.println("Enter the Amount: ");
				    			 details.setAccountBalance(sc.nextDouble());
				    			 accountDetails.put(an,details);
				    			 System.out.println("*****AMOUNT UPDATED SUCCESSFULLY*****");
			    				 DisplayDetails(details);
				    			 break;
				    		 }
				    		 case 4:{
				    			 System.out.println("Enter Currency Type: ");
				    			 details.setCurrency(sc.next());
				    			 System.out.println("*****CURRENCY UPDATED SUCCESSFULLY*****");
			    				 DisplayDetails(details);
				    			 break;
				    		 }
				    		default:{
				    			System.out.println("Enter a valid option :");
					    		 System.out.println("Select the field \n1: Account Type\n2: Full Name\n3: Amount \n4: Currency Type ");
					    		 i=sc.nextInt();

				    		}
				    		 
				    		 }
				    			System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nN: Close this Screen");
								c=sc.next().charAt(0);
				    	 }
				    	 else {
				    		 System.out.println("*****ACCOUNT NOT FOUND*****\n");
					    	 System.out.println("_____________________________________________");
					    	 System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nD: Delete an account\nN: Close this Screen");
								c=sc.next().charAt(0);
				    	 }
				    	 
				    	 
				     }
//__________________________________________________________________________________
		    	 
		    	 else if((c!='Y')&&(c!='N')&&(c != 'E')&&(c!='V')&&(c!='D')) {
			    	 System.out.println("Invalid option choosen");
			    	 System.out.println("_____________________________________________");
			 		System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nN: Close this Screen");
						c=sc.next().charAt(0);
			     }
//__________________________________________________________________________________
    	 
		    	 else if(c=='V') {
		    		 long an;
		    		 System.out.println("Enter the Account Number");
			    	 an=sc.nextLong();
			    	 if(accountDetails.containsKey(an)) {
			    		 AccountDetails details=new AccountDetails();
			    		 details=accountDetails.get(an);
			    		 DisplayDetails(details);
			    		 System.out.println("Do you want to DEPOSIT or WITHDRAW:\n press Y: for Yes\n press any key : for No ");
			    		 char y;
			    		 y=sc.next().charAt(0);
			    		 if(y=='Y') {
			    			 while(true) {
			    			 System.out.println("Select your option 1: Deposit\t2: Withdraw :");
			    			 int p=sc.nextInt();
			    			 if(p==1) {
			    				 System.out.println("Enter the amount to Deposit: ");
			    				 double amt=sc.nextDouble();
			    				 details.setAccountBalance((details.getAccountBalance())+amt);
			    				 System.out.println("UPDATED BALANCE: "+((details.getAccountBalance())+"\n"));
			    				 break;
			    			 }
			    			 else if(p==2) {
			    				 System.out.println("Enter the amount to Withdraw: ");
			    				 while(true) {
			    				 double amt1=sc.nextDouble();
			    				 if((details.getAccountBalance()>=(amt1))){
			    					 details.setAccountBalance((details.getAccountBalance())-amt1);
			    					 System.out.println("UPDATED BALANCE: "+((details.getAccountBalance())+"\n"));			    					 break;
			    				 }
			    				 else {
			    					 System.out.println("Please enter amount less than: "+details.getAccountBalance());
			    				 }
			    			 }
			    		break;
			    		 }
			    			 else {
			    				 System.out.println("*****PLEASE SELECT A VALID OPTION*****\n");
			    			 }
			    			 }
			    		 }
			    		 else {
			    			 System.out.println("__________________________________________");
			    		 }
			    			 
			    		 System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nD: Delete an account\nN: Close this Screen");
							c=sc.next().charAt(0);
		    	 }
			    	 else {
			    		 System.out.println("*****ACCOUNT NOT FOUND*****\n");
				    	 System.out.println("_____________________________________________");
				    	 System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nD: Delete an account\nN: Close this Screen");
							c=sc.next().charAt(0);
			    	 }
			    		 
			     }
//__________________________________________________________________________________

			     else if(c=='D') {
			    	 long an;
			    	 while(true) {
		    		 System.out.println("Enter the Account Number");
		    		 
			    	 an=sc.nextLong();
			    	 if(accountDetails.containsKey(an)) {
			    		accountDetails.remove(an);
			    		System.out.println("*****ACCOUNT DELETED SUCCESSFULLY*****");
			    		System.out.println("_____________________________________________");
			    		System.out.println("Please select the option:\nY: For creating a new Account\nE: Update the details for an Existing account\nV: View the Account details\nD: Delete an account\nN: Close this Screen");
							c=sc.next().charAt(0);
			    		 break;
			     }
			    	 else {
			    		 System.out.println("*****ACCOUNT NOT FOUND*****");
			    		 System.out.println("___________________________________");
			    	 }
			     
			     
		    		 }
			     }
	//_____________________________________________________________________________________

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
//__________________________________________________________________________________
	
	public static void DisplayDetails(AccountDetails acc) {
		
		
   	 System.out.println("_____________________________________________");
		System.out.println("Account Type :\t\t"+acc.getAccountType());
		System.out.println("Account Holder Name :\t"+acc.getAccountName());
		System.out.println("Account Number :\t"+acc.getAccountNumber());
		System.out.println("Amount in Account :\t"+acc.getAccountBalance());
		System.out.println("Currency mode :\t\t"+acc.getCurrency());
   	 System.out.println("_____________________________________________\n");

	}
	
	

	}

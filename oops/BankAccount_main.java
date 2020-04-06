package pkg.oops;

public class BankAccount_main {

	public static void main(String[] args) {
		BankAccount b=new BankAccount(34,"Anil",32200);
		b.deposit(300);
		b.withdraw(500);
		b.currentbal();
		
		System.out.println("\n");
		
		BankAccount b1=new BankAccount();
		b1.setAccount_name("Sunil");
		b1.setAccount_num(35);
		b1.setCurrent_bal(50000);
		b1.withdraw(40000);
		b1.deposit(1111);
		b1.currentbal();
		

	}

}

package pkg.oops;

public class BankAccount {
private int account_number;
private String acc_name;
private int current_balance;

public int getAccount_num() {
	return account_number;
}
public void setAccount_num(int account_num) {
	this.account_number = account_num;
}
public String getAccount_name() {
	return acc_name;
}
public void setAccount_name(String account_name) {
	this.acc_name = account_name;
}
public int getCurrent_bal() {
	return current_balance;
}
public void setCurrent_bal(int current_bal) {
	this.current_balance = current_bal;
}
public void deposit(int amt){
	
	current_balance=current_balance+amt;
	
	
}
public void withdraw(int amt){
	if(amt<=current_balance){
	current_balance=current_balance-amt;
	}
	else{
		System.out.println("Withdraw amount exceeded");
	}
}
public void currentbal(){
	System.out.println("Name :"+acc_name+"\nAccout number: "+account_number+"\nYour current balance is "+current_balance);
}
public BankAccount(int acc_num,String name,int bal){
	this.account_number=acc_num;
	this.acc_name=name;
	this.current_balance=bal;
}
public BankAccount(){
}
}



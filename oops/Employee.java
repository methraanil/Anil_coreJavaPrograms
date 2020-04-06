package pkg.oops;

public class Employee {
  String name="";
  int id=31133;
  int salary=100;
  
  public void CalculateBonus(){
	  double bonus;
	  bonus=salary*0.2;
	  System.out.println("employee "+name+" got "+bonus+" bonus this month");
	  
  }
  
}

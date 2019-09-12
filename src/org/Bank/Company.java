package org.Bank;

public class Company extends AxisBank {
public void saving() {
	// TODO Auto-generated method stub
	System.out.println("saving");
}
public void fixed() {
	// TODO Auto-generated method stub
System.out.println("fixed");
}
public static void main(String[] args) {
Company c=new Company();
c.fixed();
c.saving();
c.deposit();
}
}
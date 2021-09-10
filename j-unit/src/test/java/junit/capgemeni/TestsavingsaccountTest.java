package junit.capgemeni;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsavingsaccountTest {
	Testsavingsaccount s = new Testsavingsaccount();  

	 @Test(expected= InsufficientBalanceException.class)
	    public void testwithdrawwithmoreamoount()
	 {
		 s.balance=10000;
		 s.withdraw(11000);
		 
	 }
	@Test
	    public void testwithdrawcrt()
	 {
		 s.balance=10000;
		 double a=s.withdraw(1000);
		 double b=9000;
		 assertEquals(b,a,0.001); 
		 
	 }
	 @Test(expected= IllegalBankTransactionException.class)
	    public void testwithdrawinnegative()
	 {
		 s.balance=10000;
		 s.withdraw(-190);
		 
	 }
	 @Test
	    public void testdeposit()
	 {
		 s.balance=10000;
		 double a=s.deposit(1000);
		 double b=11000;
		 assertEquals(b,a,0.001); 
		 
	 }
	 @Test
	    public void testgetbalance()
	 {
		 double b=s.balance=10000;
		 double a=s.getBalance();
		 assertEquals(b,a,0.001); 
		  
		 
	 }
	}

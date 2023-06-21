package StepDefinition;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	@Test
	@BeforeMethod
	public void BfMethod() {
	System.out.println("I will execute before evy testcase in testClass");	
	}
	@Test
	@AfterMethod
	public void AfMethod() {
	System.out.println("I will execute before evy testcase in testClass");	
	}
	
	public void diplay() {
		System.out.println("TESTNG");
	}
}
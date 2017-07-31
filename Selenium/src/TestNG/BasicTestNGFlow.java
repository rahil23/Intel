package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNGFlow {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforeSuite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Aftermethod");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
}

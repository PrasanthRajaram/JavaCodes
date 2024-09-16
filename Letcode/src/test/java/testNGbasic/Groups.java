package testNGbasic;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"smoke"})
	public void signup()
	{
		System.out.println("Signup");
	}
	@Test(groups = {"reg"})
	public void login()
	{
		System.out.println("login");
	}
	@Test(dependsOnMethods = "addtocart")
	public void searchprduct()
	{
		System.out.println("searchprduct");
	}
	@Test(groups = {"smoke"})
	public void addtocart()
	{
		System.out.println("addtocart");
	}
	@Test(priority=5)
	public void signout()
	{
		System.out.println("signout");
	}

}


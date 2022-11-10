package TestNg;

import org.testng.annotations.Test;

public class TestNg_Priority {
	@Test(priority=3)
	public void red()
	{
		System.out.println("red");
	}
	
	
	@Test(priority=1)
	public void green()
	{
		System.out.println("green");
	}
	
	@Test(priority=4)
	public void yellow()
	{
		System.out.println("yellow");
	}
	
	@Test(priority=5)
	public void blue()
	{
		System.out.println("blue");
	}

	@Test(priority=2)
	public void white()
	{
		System.out.println("white");
	}
}

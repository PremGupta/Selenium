package PackTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annot2 {

	//this is new commit prem 
/*	@BeforeSuite
	public void installSoftware()
	{
		System.out.println("BeforeSuite -  installSoftware");
	}
	
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("AfterSuite -  deinstallSoftware");
	}*/
	
	@BeforeSuite
	public void installSoftware()
	{
		System.out.println("BeforeSuite -  installSoftware");
	}
	
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("AfterSuite -  deinstallSoftware");
	}
}

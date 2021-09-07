package TestPackages;

import java.util.Date;

import org.apache.poi.util.SystemOutLogger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import BasePackages.ProjectBasePackages;


public class MainProjects extends ProjectBasePackages {

	@BeforeClass
	public static void beforeClass()
	{
		//launchBrowser("chrome");
		//implicitwait(5);
		//System.out.println("Browser Launched");
//		launchurl("https://adactinhotelapp.com/index.php");
		
	}
	
	@BeforeMethod
	public void Before() {
		System.out.println("Test Execution Time" +new Date());
		launchBrowser("chrome");
		implicitwait(5);
		System.out.println("Browser Launched");
		launchurl("https://adactinhotelapp.com/index.php");
		

	}
	@Parameters({"Username","pwd"})
	@Test(invocationCount=1)
	public void tests(@Optional("rnaveenraj") String user ,@Optional("rnaveen")String pass) throws InterruptedException {
		
		
		System.out.println("Test");
		ProjectElements ae = new ProjectElements();
	   filltextbox(ae.getUname() , user);
	   filltextbox(ae.getPwd()  , pass);
	   click(ae.getUlogin());
	   
		drpdwns(ae.getlocation(), 3);
		drpdwns(ae.gethotels(),3);
		drpdwns(ae.getroom_type(),3);
		drpdwns(ae.getadult_room(),3); 
		drpdwns(ae.getchild_room(),3);
		click(ae.getusubmit());		   
		click(ae.getRb0());
		click(ae.getccontinue());
		
		filltextbox(ae.getregfname(), "fname");
		filltextbox(ae.getreglname(), "lname");
		filltextbox(ae.getccnum(), "1234567812345678");
		filltextbox(ae.getaddress() , "Address");
		drpdwns(ae.getcctype(),3);
		drpdwns(ae.getcc_exp_month(),3);
		drpdwns(ae.getcc_exp_year (),3);
		filltextbox(ae.getCccvv() ,"123");
		click(ae.getbknw());
		Thread.sleep(5000);
		System.out.println(getAttribute(ae.getorderno()));
		closebrowser();
		
				
	}
	
	
	@AfterMethod
	public void after() {
		System.out.println("Completion time"  +new Date());

	}
	
	
	@AfterClass
	public static void AfterClass() {
	quitbrowser();
	}
	
}

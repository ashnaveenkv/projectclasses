package BasePackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectBasePackages {
	
	
	
	public static WebDriver driver;
	// launch browser -01
	public static  WebDriver launchBrowser(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			break;
		default:
			System.err.println("Invalid Browser");
			break;
		}
		return driver;
	}
	//2launch url
	public static WebDriver launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}
	//3- Implicit wait time
	public static void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		// TODO Auto-generated method stub

		
		
		
	}
	
	public static void drpdwns(WebElement e,int num) {


		
		Select s = new Select(e);
		s.selectByIndex(num);
		

	}
	
	
	
	// 4- get current url
	public static String currenturl() {
	String url= driver.getCurrentUrl();
	return url;
	
	}
	
	//5 - getAttribute
	public static String getAttribute(WebElement e)
	{
	return e.getAttribute("value");	
	}
	//6 - Mouse Actions move to Element
	public static  void moveToElement(WebElement target) {
	Actions a = new Actions(driver);
	a.moveToElement(target).perform();
	}
	
	//7- Contextclick-rightclick  mouse action
	public static  void contextclick(WebElement target) {
	Actions a = new Actions(driver);
	a.contextClick(target).perform();
	}
	
	//10 - mouse action - double click
	public static  void doubleclick(WebElement target) {
	Actions a = new Actions(driver);
	a.doubleClick(target).perform();
	}
	
	//11 Click
	public static void click(WebElement e)
	{
	e.click();
	}
	//12 Click with perform using mouse
	public static void clickperform(WebElement target)
	{
	Actions a = new Actions(driver);
	a.click(target).perform();
	}
	
	//13drag and drop 
	public static String draganddrop(WebElement src,WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		return null;
	}
	
	//14drag and drop using click and hold , release
		public static String clickholdrelease(WebElement src,WebElement dest) {
			Actions a = new Actions(driver);
			a.clickAndHold(src).release(dest).perform();
			return null;
		}
	
	
		
	//15 send inputs to textbox
	public void filltextbox(WebElement e, String value) {
		e.sendKeys(value);

	}
	
	//16 Assign elments  using id,name and xpath
	public static WebElement findelementer(String locator, String value) {
		WebElement e = null;
		if(locator.equals("id"))
		{
			e = driver.findElement(By.id(value));
		}
		else if(locator.equals("name"))
		{
			e = driver.findElement(By.name(value));
		}
		else if(locator.equals("xpath"))
		{
		e=driver.findElement(By.xpath("value"));
		}
					return e;

		
		
	}
	

	
	
	
	//17 getwindowhandle
	public static void windowhandle() {
		driver.getWindowHandle();

	}
	
	//18 Navigate Forward
	public static void navigateforward() {
		driver.navigate().forward();

	}

	//19 Navigate backward
	public static void navigatebackward() {
		driver.navigate().back();

	}
	
	//20 refreshbrowser
	public static void refreshbrowser() {
		driver.navigate().refresh();

	}
	
	//21 screenshot
	public static void screenshots() throws Exception
	{
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		long time = System.currentTimeMillis();
		
		File desc = new File("C:\\Users\\ashna\\eclipse-workspace\\Maven_Projects\\src\\test\\resources\\Screenshots" +time);
		FileUtils.copyFile(src, desc);
	}
	
	//22 Quit browser
	public static void quitbrowser()
	{
		driver.quit();
	}
	
	//23 - Close browser
	
	public static void closebrowser() {
		driver.close();

	}
	//24 - Enter
	public static void Enter(WebElement e) {
		e.sendKeys(Keys.ENTER);
		

	}
	
	//25 get browser title
	public static void title() {
		//driver.getTitle();
		System.out.println(driver.getTitle());

	}
	
	//26 Excel data Reading for type 0 and 1
	
public static String ExcelDataReading(int rowno, int cellno) throws IOException {
	
	//File Path
	File loc = new File("C:\\Users\\ashna\\eclipse-workspace\\Maven_Projects\\src\\test\\resources\\RegisterFBAcc\\RegFBAcc.xlsx");
	FileInputStream st = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(st); // FOR XLSX
	//Workbook w1 = new HSSFWorkbook();//forxls
	Sheet sht = w.getSheet("RegData"); // to call the particular sheet
	Row rw = sht.getRow(rowno);// to call the rowno
	Cell cl = rw.getCell(cellno);// to call the value from cell
	int type = cl.getCellType(); // to get the cell type 0 or 1, 1 - strings
	
	String value = null;
		if(type==1)
		{
			value = cl.getStringCellValue();
		}
		else
		{
			if(DateUtil.isCellDateFormatted(cl) )
			{
			 value = new SimpleDateFormat("dd-MMM-YYY").format(cl.getDateCellValue());
			}
			else
			{
			 // double nm = cl.getNumericCellValue();
			  //long ln = (long) nm;
			  //value = String.valueOf(ln);
			  //System.out.println(value);
				
				value = String.valueOf((long)cl.getNumericCellValue());
			  
			}
			
	}
		return value;
	
		

}
	
	
}

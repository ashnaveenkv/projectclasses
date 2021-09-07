package TestPackages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackages.ProjectBasePackages;

public class ProjectElements extends ProjectBasePackages {
	
	
	 public ProjectElements() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	} {

	}	
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	

	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	
	
	@FindBy(id = "username")
	private WebElement uname;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	
	@FindBy(id="login")
	private WebElement ulogin;

	@FindBy(id="Submit")
	private WebElement usubmit;

     @FindBy(id="radiobutton_1")
     private WebElement rb1;
     
     @FindBy(id="radiobutton_0")
     private WebElement rb0;
     
     @FindBy(id="first_name")
     private WebElement regfname;
	
     @FindBy(id="last_name")
     private WebElement reglname;
     
     @FindBy(id="address")
     private WebElement address;
     
     @FindBy(id = "cc_num")
     private WebElement ccnum;
     
     @FindBy(id="book_now")
     private WebElement bknw;
     
     @FindBy(id="continue")
     private WebElement ccontinue;
     
     @FindBy(id="order_no")
     private WebElement orderno;
     
     @FindBy(id="location")
     private WebElement location;
     
     @FindBy(id = "adult_room")
     private  WebElement adult_room;
     
     
     @FindBy(id="child_room")
     private WebElement child_room;
     
     @FindBy(id="cc_exp_year")
     private WebElement cc_exp_year;
     
     @FindBy(id="cc_cvv")
     private WebElement cccvv;
     
     @FindBy(id="room_type")
     private  WebElement room_type;
     
     @FindBy(id = "hotels")
     private WebElement hotels;
     
     public WebElement gethotels() {
  		return hotels;
  	}
     
     public WebElement getroom_type() {
 		return room_type;
 	}



    public WebElement getCc_exp_month() {
		return cc_exp_month;
	}


	public WebElement getCctype() {
		return cctype;
	}


	public WebElement getAdd() {
		return add;
	}


	public WebElement getUsubmit() {
		return usubmit;
	}


	public WebElement getRb1() {
		return rb1;
	}

	
	public WebElement getRb0() {
		return rb0;
	}

	public WebElement getRegfname() {
		return regfname;
	}


	public WebElement getReglname() {
		return reglname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCcnum() {
		return ccnum;
	}


	public WebElement getBknw() {
		return bknw;
	}


	public WebElement getCcontinue() {
		return ccontinue;
	}


	public WebElement getOrderno() {
		return orderno;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getAdult_room() {
		return adult_room;
	}


	public WebElement getChild_room() {
		return child_room;
	}


	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}


	public WebElement getCccvv() {
		return cccvv;
	}


	public WebElement getcc_exp_year()
    {
    	return cc_exp_year;
    }
     
     
     public WebElement getchild_room()
     {
    	 return child_room;
     }
     
     public WebElement getadult_room()
     {
    	 return adult_room;
     }
     
     public WebElement getlocation()
     {
    	 return location;
     }
     
	public WebElement getUname() {
		return uname;
	}


	public WebElement getPwd() {
		return pwd;
	}


	public WebElement getUlogin() {
		return ulogin;
	}
	
	public WebElement getusubmit() {
		return usubmit;
	}
	
	public WebElement getrb1() {
		return rb1;
		
	
	}
	
	public WebElement getreglname() {
		return reglname;
	}
	
	public WebElement getregfname() {
		return regfname;
	}
	
	
	public WebElement getaddress() {
		return address;
	}
	
	
	public WebElement getccnum() {
		return ccnum;
	}
	
	public WebElement getbknw() {
		return bknw;
	}
	
	
	public WebElement getccontinue() {
		return ccontinue;
	}
	
	public WebElement getadd()
	{
		return add;
	}
	
	public WebElement getorderno()
	{
		return orderno;
	}
	
	public WebElement getcctype()
	{
		return cctype;
	}

	public WebElement getcc_exp_month()
	{
		return cc_exp_month;
	}

}

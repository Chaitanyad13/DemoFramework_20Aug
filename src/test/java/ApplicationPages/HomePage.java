package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver ldriver){
		this.driver = ldriver;
		
	}
	
	@FindBy (xpath= "//span[@class=' Log In']")
	WebElement logInLink;
	
	@FindBy (xpath= "//span[@class='My Account']")
	WebElement myAccountLink;
	
	@FindBy (xpath= "//span[@class='My Cart']")
	WebElement myCartLink;
	
	@FindBy (xpath= "//span[@class='Wish List']")
	WebElement wishListLink;
	
	@FindBy (xpath= "//span[@class='hidden-xs'][text()='Home']")
	WebElement homePageLink;
	
	
	public void clickOnMyAccountLink() {
		
		myAccountLink.click();
	}
	
	public void clickOnMyCartLink(){
		
		myCartLink.click();
	}
	
	public void clickOnWishListLink(){
		
		wishListLink.click();
	}
	
	public void clicOnHomePageLink(){
		
		homePageLink.click();
	}
	
	public String getApplicationTitle(){
		
		return (driver.getTitle());
	}
	
	
}

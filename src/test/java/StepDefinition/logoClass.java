package StepDefinition;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
 
public class logoClass {
	
	WebDriver driver;
	@Test(priority=1)
	@Given("open YourLogo Website")
	public void open_your_logo_website() throws InterruptedException{	
		ChromeOptions c = new ChromeOptions();
		   c.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver(c);
		   
		      System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32//geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.33.0-win32.exe");
		//WebDriver driver = new FirefoxDriver();
		      driver.get("https://www.yourlogo.com/");
		      driver.manage().window().maximize();
		     Thread.sleep(2000);
	        
	}
	@Test(priority=2)
	@And("click on Shop Now")
	public void click_on_shop_now() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'secondaryNavWrapper\']/nav/div/a/span")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	@Then("click on SignIn")
	public void click_on_sign_in() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href=\"https://yourlogo.geiger.com/login\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	@And("enter email address")
	public void enter_email_address() throws InterruptedException {
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("JohnAllen123@gmail.com");
		Thread.sleep(2000);
	}
	@Test(priority=5)
	@And("enter password")
	public void enter_password() throws InterruptedException {
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("JohnAllen@123");
		Thread.sleep(2000);
	}
	@Test(priority=6)
	@And("enable click on remember me")
	public void enable_click_on_remember_me() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()=\"Remember Me\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=7)
	@Then("click on login")
	public void click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Log In ']")).click();
		Thread.sleep(3000);
	}
	@Test(priority=8)
	@And("click on shop by product")
	public void click_on_shop_by_product() throws InterruptedException  {
		 driver.findElement(By.xpath("//a[text()=\"Shop by Product\"]")).click();	
		 Thread.sleep(1000);
	}
	@Test(priority=9)

	@And("click on office and technology")
	public void click_on_office_and_technology() throws InterruptedException {
		driver.findElement(By.xpath("//div //ul //a[text()=\"Office & Technology\"]")).click();	
		 Thread.sleep(2000);
	}
	@Test(priority=10)
	@And("click on Tech Accessories")
	public void click_on_tech_accessories() throws InterruptedException {
		 driver.findElement(By.xpath("//div //ul //a[text()=\"Tech Accessories\"]")).click();		
		 Thread.sleep(2000);
	}
	@Test(priority=11)
	@And("click on charges and power banks")
	public void click_on_charges_and_power_banks() throws InterruptedException {
		driver.findElement(By.xpath("//div //ul //a[text()=\"Chargers & Power Banks\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=12)
	@Then("choose showing count")
	public void choose_showing_count() throws InterruptedException {
		WebElement dp1 = driver.findElement(By.cssSelector("select[id=\"nxt-select-rpp\"]"));
		Select s1 = new Select(dp1);
		//so.selectByIndex(2);
		//List<WebElement> options = driver.findElements(By.cssSelector("select[id=\\\"nxt-select-rpp\\\"]"));
		List<WebElement> allAvailableOptions = s1.getOptions();
		for(WebElement option : allAvailableOptions) {
			if(option.getText().equalsIgnoreCase("90"))
				option.click();
			Thread.sleep(2000);
		}
	}
	@Test(priority=13)
	@Then("choose display mode")
	public void choose_display_mode() throws InterruptedException {
		WebElement dp2 = driver.findElement(By.cssSelector("select[title=\"Sort By\"]"));
		Select s2 = new Select(dp2);
		s2.selectByIndex(1);
		Thread.sleep(2000);
	}
	@Test(priority=14)
	@And("select black color")
	public void select_black_color() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()=\"Black\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=15)
	@And("select white color")
	public void select_white_color() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()=\"White\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=16)
	@Then("selcet price mode")
	public void selcet_price_mode() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()=\"$5.01 - $10.00\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=17)
	@And("choose color mode")
	public void choose_color_mode() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()=\"Yes\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=18)
	@Then("click on image")
	public void click_on_image() throws InterruptedException {
		 driver.findElement(By.cssSelector("img[src=\"https://imgsirv.geiger.com/master/122266/web/122266_1.jpg?thumbnail=275\"]")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=19)
	@Then("choose white color")
	public void choose_white_color() throws InterruptedException {
		 driver.findElement(By.cssSelector("label[title=\"WHITE\"]")).click();	 
		 Thread.sleep(2000);
	}
	@Test(priority=20)
	@Then("make mouse action on image")
	public void make_mouse_action_on_image() throws InterruptedException {
		 Actions actions = new Actions(driver);
		 WebElement e = driver.findElement(By.xpath("//div[@class=\"col col-preview-image\"]"));
		 actions.moveToElement(e).perform();
		 actions.moveToElement(e).sendKeys(Keys.ARROW_LEFT).perform();
		 Thread.sleep(1000);
		 actions.moveToElement(e).sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 actions.moveToElement(e).sendKeys(Keys.ARROW_RIGHT).perform();
		 Thread.sleep(1000);
		 actions.moveToElement(e).sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
	}
	@Test(priority=21)
	@And("choose quantity")
	public void choose_quantity() throws InterruptedException {
		driver.findElement(By.xpath("//td[text()=\" 50+ \"]")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=22)
	@And("write ask a question")
	public void write_ask_a_question() throws InterruptedException {
		 driver.findElement(By.cssSelector("textarea[id=\"product-customizer-user-notes\"]")).sendKeys("Is this product supports all mobiles?");
		 Thread.sleep(2000);
	}
	@Test(priority=23)
	@Then("sort by version")
	public void sort_by_version() {
		WebElement dp3 = driver.findElement(By.cssSelector("select[aria-label=\"Sort reviews\"]"));
		Select s3 = new Select(dp3);
		s3.selectByValue("oldest");
		driver.close();
		
	}
	


}



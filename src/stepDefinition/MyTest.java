package stepDefinition;	package StepDefination;


 import java.util.concurrent.TimeUnit;	import java.util.concurrent.TimeUnit;


 import org.openqa.selenium.By;	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;	
import org.openqa.selenium.WebDriver;	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 import cucumber.api.java.en.Given;	import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;	import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;	import cucumber.api.java.en.When;


 public class MyTest {	public class NJITStepDefinition {


 	static WebDriver driver;		WebDriver driver;


 	@Before		@Given("^User is on transcript portal$")
	public void beforeTest() {		public void user_is_on_transcript_portal() throws InterruptedException {

 	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",			System.out.println("Testing NJIT branch.");
				"D://Selenum//chromedriver.exe");			System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");

 		driver = new ChromeDriver();
		// Initialize browser	

 		// Write code here that turns the phrase above into concrete actions	
	}	

 	@Given("Open the Chrome and launch the application")	
	public void open_the_Chrome_and_launch_the_application() {	
		System.out.println("Enter URL");	
		ChromeDriver chromeDriver = new ChromeDriver();	
		driver = chromeDriver;	

 		// Open Sparring website	
		driver.get("https://portal-dev.measureone.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		// Maximize browser	

 		driver.manage().window().maximize();			driver.manage().window().maximize();

 		driver.get("https://portal-dev.measureone.com/");
	}			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 	@When("Enter All Valid details")	
	public void enter_URL_of_Admin_portal() {	
		System.out.println("Enter url");	

 		driver.findElement(By.id("firstName")).sendKeys("Bharat");			driver.findElement(By.id("firstName")).sendKeys("Bharat");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.findElement(By.id("lastName")).sendKeys("Hirani");			driver.findElement(By.id("lastName")).sendKeys("Hirani");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			driver.findElement(By.id("email")).sendKeys("bhirani@m1.com");
		driver.findElement(By.id("email")).sendKeys("bhirani@measure1.com");			driver.findElement(By.id("terms-condition")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	
 		try {			 // explicit wait - to wait for the compose button to be click-able
			Thread.sleep(5000);	
 		} catch (InterruptedException e) {			WebDriverWait wait = new WebDriverWait(driver,120);
			e.printStackTrace();	
 		}	
 		driver.findElement(By.id("checkbox1")).click();	
 		// System.out.println("Into given :: " + webElement.getText());			wait.until(ExpectedConditions.elementToBeClickable(By.id("submitBtn")));


 		// Write code here that turns the phrase above into concrete actions			              // click on the compose button as soon as the "compose" button is visible
		// throw new PendingException();	
 	}	

 	@Then("Registration should be done")	
	public void login_using_MeasureOne_credentials() {	
		System.out.println("login");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.findElement(By.id("submitBtn")).click();			driver.findElement(By.id("submitBtn")).click();
		// Write code here that turns the phrase above into concrete actions	
 		// throw new PendingException();			System.out.println("Clicked on Continue");
	}	
 		Thread.sleep(2000);




 	@Given("that user on school page")			
	public void that_user_on_school_page() {			
		System.out.println("In second given");		    System.out.println("Inside Given");


 		// Write code here that turns the phrase above into concrete actions	
	}		}


 	@When("Select school name")		@When("^User selects NJIT as school and redirect to website$")
	public void select_school_name() {		public void user_selects_NJIT_as_school_and_redirect_to_website() throws InterruptedException {
		try {		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(3000);			System.out.println("Inside When");
		} catch (InterruptedException e) {	
 			e.printStackTrace();			driver.findElement(By.id("schoolNameMain")).sendKeys("New Jersey institute of");
		}			driver.findElement(By.xpath("//button[@class='dropdown-item active']")).click();
		System.out.println("In second When at load time and into else");	
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			Boolean checkboxselected = driver.findElement(By.id("radio1")).isSelected();


 		driver.findElement(By.id("schoolName")).click();	
 		System.out.println("In second When after click");			if (checkboxselected) {
		driver.findElement(By.id("schoolName")).sendKeys(				System.out.println("Undergraduate already selected");
				"Southern Methodist University");				} else {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);					driver.findElement(By.id("radio1")).click();
		System.out.println("In second When after wait");					System.out.println("Selected Undergraduate as Academic Level");
		// school.selectByVisibleText("University Of Michigan-Ann Arbor");				}
		driver.findElement(By.id("schoolName")).sendKeys(Keys.DOWN);			Thread.sleep(2000);
		driver.findElement(By.id("schoolName")).sendKeys(Keys.ENTER);			driver.findElement(By.xpath("//div[@class='col-4 col-lg-4 col-md-4 sticky-button pr-0']//button[@id='submitBtn']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			System.out.println("Click on continue with selected school");


 		// Write code here that turns the phrase above into concrete actions			driver.findElement(By.xpath("//div[@class='col-5 col-lg-4 col-md-4 sticky-button last-btn']//button[@id='submitBtn']")).click();
		System.out.println("Click on continue and selected upload from school site");

 		Thread.sleep(2000);

 	}		}


 	@Then("Click on next")		@Then("^Upload transcript and submit the transaction$")
	public void click_on_next() {		public void upload_transcript_and_submit_the_transaction() throws InterruptedException  {
		driver.findElement(By.id("btnSubmit")).click();			System.out.println("Inside Then");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	


 		System.out.println("waiting to click on login");		//	WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.switchTo().frame("mo-university-wrapper");			//WebElement Usernameinput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("login-button")).click();			 //Usernameinput.sendKeys("ss2444");
		// driver.findElement(By.id("login-button")).click();	
 		System.out.println("click on login");		//WebDriverWait wait = new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
 		System.out.println("waiting for typing username and password");	
 		driver.findElement(By.id("username")).sendKeys("33993275");	
 		driver.findElement(By.id("password")).sendKeys("Measure1");			//wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
 		System.out.println("waiting to click on login button");			              // click on the compose button as soon as the "compose" button is visible

 		//driver.findElement(By.name("j_username")).sendKeys("ss2444");



 	//	WebElement fr = driver.findElement(By.id("univWrapper"));

 		driver.switchTo().frame("univWrapper");		
		//WebElement fr = driver.findElement(By.id("univWrapper"));

 		//driver.switchTo().frame(fr);
System.out.println("inside uni wrapper frame");

 driver.switchTo().frame("mo-university-wrapper");

 System.out.println("inside Mo wrapper frame");
Thread.sleep(5000);
		//driver.switchTo().frame("mo-university-wrapper");

 		driver.findElement(By.cssSelector("#username")).sendKeys("ss2444");
		System.out.println("click  in usermane");



 		driver.findElement(By.name("j_password")).sendKeys("sadhna1994");

 		System.out.println("Before click");
		driver.findElement(By.name("_eventId_proceed")).click();			driver.findElement(By.name("_eventId_proceed")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			System.out.println("after click");
		System.out.println("Clicking on Academic Records");	
 		driver.findElement(By.id("PS_TEAM_LEARNING_L_FL$1")).click();	
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			driver.findElement(By.xpath("//li[@id='layout_6']//a")).click();
		System.out.println("Clicking on View Unofficial Transcript");			System.out.println("Clicked on Student services");
		driver.findElement(By.id("PTGP_STEP_DVW_PTGP_STEP_LABEL$1")).click();	
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			driver.findElement(By.xpath("//a[contains(text(),'Self Service Banner (SSB)')]")).click();
		System.out.println("Clicking on Go button");			System.out.println("Clicked on Service Banner");
		driver.switchTo().frame("main_target_win0");	
 		driver.findElement(By.id("GO")).click();			driver.findElement(By.xpath("//a[contains(text(),'Student Records')]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			System.out.println("Clicked on Student records");
		System.out.println("Clicking on Upload button");	
 		driver.switchTo().frame("mo-university-wrapper");			driver.findElement(By.xpath("//a[contains(text(),'Academic Transcript')]")).click();
		driver.findElement(By.className("mo-upload-item-icon")).click();			System.out.println("Clicked on Academic Transcript");
		System.out.println("Clicking on OK button");	
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);			driver.findElement(By.xpath("//div[@class='pagebodydiv']//form//input")).click();

 		System.out.println("Clicked on submit");
		driver.findElement(By.id("mo-upload-submit")).click();	
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	

 		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-univrsity[1]/div[3]/ul[1]/li[2]/a[1]/span[1]/span[1]")).click();
		System.out.println("locating Submit button");	
 		try {			System.out.println("Clicked on add to cart");
			Thread.sleep(1000);			driver.findElement(By.xpath("//input[@class='card-button primary-color mr-1 float-right text-center']")).click();
		} catch (InterruptedException e) {			System.out.println("Clicked on checkout");
			e.printStackTrace();	
		}	
		driver.findElement(By.id("btnSubmit")).click();			driver.findElement(By.id("btnSubmit")).click();
		System.out.println("Clicked on Submit button");			System.out.println("Clicked on submit transacion");


 		// WebElement searchBtn = driver.findElement(By.id("btnSubmit"));			driver.close();


 		// Actions action = new Actions(driver);	
		// action.moveToElement(searchBtn).click().perform();	

 	}		}




 }

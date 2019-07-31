package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyTest {

	static WebDriver driver;

	@Before
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"D://Selenum//chromedriver.exe");

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

		driver.manage().window().maximize();

	}

	@When("Enter All Valid details")
	public void enter_URL_of_Admin_portal() {
		System.out.println("Enter url");

		driver.findElement(By.id("firstName")).sendKeys("Bharat");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("lastName")).sendKeys("Hirani");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("bhirani@measure1.com");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("checkbox1")).click();
		// System.out.println("Into given :: " + webElement.getText());

		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("Registration should be done")
	public void login_using_MeasureOne_credentials() {
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("submitBtn")).click();
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("that user on school page")
	public void that_user_on_school_page() {
		System.out.println("In second given");

		// Write code here that turns the phrase above into concrete actions
	}

	@When("Select school name")
	public void select_school_name() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("In second When at load time and into else");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("schoolName")).click();
		System.out.println("In second When after click");
		driver.findElement(By.id("schoolName")).sendKeys(
				"Southern Methodist University");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("In second When after wait");
		// school.selectByVisibleText("University Of Michigan-Ann Arbor");
		driver.findElement(By.id("schoolName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("schoolName")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("Click on next")
	public void click_on_next() {
		driver.findElement(By.id("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		System.out.println("waiting to click on login");
		driver.switchTo().frame("mo-university-wrapper");
		driver.findElement(By.id("login-button")).click();
		// driver.findElement(By.id("login-button")).click();
		System.out.println("click on login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("waiting for typing username and password");
		driver.findElement(By.id("username")).sendKeys("33993275");
		driver.findElement(By.id("password")).sendKeys("Measure1");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("waiting to click on login button");
		driver.findElement(By.name("_eventId_proceed")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Clicking on Academic Records");
		driver.findElement(By.id("PS_TEAM_LEARNING_L_FL$1")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Clicking on View Unofficial Transcript");
		driver.findElement(By.id("PTGP_STEP_DVW_PTGP_STEP_LABEL$1")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Clicking on Go button");
		driver.switchTo().frame("main_target_win0");
		driver.findElement(By.id("GO")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Clicking on Upload button");
		driver.switchTo().frame("mo-university-wrapper");
		driver.findElement(By.className("mo-upload-item-icon")).click();
		System.out.println("Clicking on OK button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.id("mo-upload-submit")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		System.out.println("locating Submit button");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("btnSubmit")).click();
		System.out.println("Clicked on Submit button");

		// WebElement searchBtn = driver.findElement(By.id("btnSubmit"));

		// Actions action = new Actions(driver);
		// action.moveToElement(searchBtn).click().perform();
	
	}

	

}

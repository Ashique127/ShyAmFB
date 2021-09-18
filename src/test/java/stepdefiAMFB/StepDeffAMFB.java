package stepdefiAMFB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDeffAMFB {

	WebDriver driver;

	@Given("^launch chrome browser$")
	public void launch_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Hi, Welcome to my world of selenium");

	}

	@Then("^navigate to Amazon India$")
	public void navigate_to_Amazon_India() throws Throwable {
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Then("^search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike shoes");
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]"))
				.click();
	}

	@Then("^naviage back and page tittle print out$")
	public void naviage_back_and_page_tittle_print_out() throws Throwable {
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page Title is:" + title);

	}

	@Then("^open FaceBook home page$")
	public void open_FaceBook_home_page() throws Throwable {
		driver.navigate().to("https://www.facebook.com");

	}

	@Then("^enter username and password and click login button$")
	public void enter_username_and_password_and_click_login_button() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("ashiqur.rahman2701@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Ashiqu@127");
		driver.findElement(By.name("login")).click();

	}

	@Then("^close FaceBook and quit$")
	public void close_FaceBook_and_quit() throws Throwable {
		driver.close();
		driver.quit();

	}

}

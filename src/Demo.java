import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// create a driver object for chrome browser
// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://bnz.co.nz");//hit url on browser
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/header/nav/ul[2]/li[4]")).click();
		System.out.println(driver.getTitle());//validate if your page Title is correct
		//rahulonlinetutor@gmail.com
		
		System.out.println(driver.getCurrentUrl());//validate current url
		
		//System.out.println(driver.getPageSource()); to get the page source if page source is disable when you right click the page.
		
		//driver.get("http://asb.co.nz");
		//System.out.println(driver.getTitle());
		//driver.navigate().back();// to navigate to back page
		//driver.navigate().forward();// to navigate forward
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.name("Register")).sendKeys("10234");
		//driver.findElement(By.id("userid")).sendKeys("suppu18");
		
		//driver.close(); // will close the current browser after running the test. which is recommended.
		//driver.quit(); // will close all the browsers opened by selenium.
}
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");//hit url on browser
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myOwnXpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		driver.close();
		//*[@id="u_0_2"]

	}

}

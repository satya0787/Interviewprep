package SeleniumPractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	
	@Test
	public void invokeurl() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		//driver.close();
		
		driver.findElement(By.id("fromCity")).sendKeys("hy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-12']")).click();
		//driver.findElement(By.xpath("//*[contains(.,'Hyderabad Begumpet Airport')]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://facebook.com");
		
		Set<String> windowhandles = driver.getWindowHandles();
		ArrayList<String> handles = new ArrayList<String>(windowhandles);
		for(String handl : handles) {
			System.out.println(handl);
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}
}

package alertbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://echoecho.com/javascript4.htm");
driver.findElement(By.name("B3")).click();
System.out.println(driver.switchTo().alert().getText());
Thread.sleep(3000);
driver.switchTo().alert().sendKeys("haiii");
Thread.sleep(2000);
driver.switchTo().alert().accept();

	}

}

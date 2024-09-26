package alertbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Confirmbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driv=new EdgeDriver();
driv.get("https://echoecho.com/javascript4.htm");
driv.findElement(By.name("B2")).click();
System.out.println(driv.switchTo().alert().getText());
Thread.sleep(2000);
driv.switchTo().alert().accept();

	}

}

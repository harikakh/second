import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class selenium {
public static void main(String args[]) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	
	WebDriverWait waitexp = new WebDriverWait(driver,10);
	WebElement servicess =waitexp.until(ExpectedConditions.elementToBeClickable(By.id("hello")));
	Select sr = new Select(driver.findElement(By.xpath("ads")));
	sr.selectByVisibleText("sad");
	List<WebElement> we = sr.getOptions();
	we.size();
	we.get(0).getText();
	JavascriptExecutor Driver = null;
	WebElement tv = (WebElement)Driver.executeScript("return document.getElementById('hj');");
	driver.get("https://www.licindia.in/");
	WebElement services = driver.findElement(By.xpath("//*[@src='images/login.jpg']"));
	services.click();
	Thread.sleep(1000);
	WebElement reguser = driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/a/img"));
	reguser.click();
	driver.close();
}
}


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Work\\Testing\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://play.google.com/store");
		driver.manage().window().maximize();

		driver.getCurrentUrl();
		System.out.println("Page Url: " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store");

		driver.findElement(By.xpath("//span[contains(text(),'Apps')]")).click();

		driver.getCurrentUrl();
		System.out.println("Page Url: " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store/apps");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//body/div[@id='fcxH9b']/div[1]/c-wiz[2]/c-wiz[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[2]"))
				.click();

		driver.findElement(By.linkText("Education")).click();

		driver.getCurrentUrl();
		System.out.println("Page Url: " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store/apps/category/EDUCATION");

		// Search
		driver.findElement(By.xpath("//input[@id='gbqfq']")).click();
		driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("TED");
		driver.findElement(By.xpath("//button[@id='gbqfb']")).click();

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[4]/c-wiz[4]/div[1]/div[2]/div[1]/c-wiz[1]/c-wiz[1]/c-wiz[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]"))
				.click();
		driver.getCurrentUrl();
		System.out.println("Page Url: " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store/apps/details?id=com.ted.android");

		driver.findElement(By.xpath("//input[@id='gbqfq']")).click();
		driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("Facebook");
		driver.findElement(By.xpath("//button[@id='gbqfb']")).click();

		WebElement element = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[4]/c-wiz[5]/div[1]/div[2]/div[1]/c-wiz[1]/c-wiz[1]/c-wiz[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		System.out.println("Image diplayed status: " + element.isDisplayed());

	}

}

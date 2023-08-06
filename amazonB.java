import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class amazonB {
	public static void main(String[] args) throws InterruptedException {
		
	

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");


		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");


		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();



		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
				.getText());


		List<WebElement> firstBrand = driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", firstBrand.get(2));

		Thread.sleep(10000);

		List<WebElement> secBrand = driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", secBrand.get(3));

		Thread.sleep(6000);
		

		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();


		List<WebElement> firstElementName = driver
				.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		System.out.println(firstElementName.get(0).getText());

		List<WebElement> firstElementPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(firstElementPrice.get(0).getText());

 
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
}
}
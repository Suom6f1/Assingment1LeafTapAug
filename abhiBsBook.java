package assignmentFridayFour;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abhiBsBook {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("pills-home-tab")).click();
	WebElement leaving = driver.findElement(By.id("source"));
	
	leaving.sendKeys("Chennai");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	 
	 
	
			
			
	WebElement reach = driver.findElement(By.id("destination"));
	reach.sendKeys("Bangalore");
	
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	
	 driver.findElement(By.id("datepicker1")).click();
	driver.findElement(By.xpath("//a[text()='9']")).click();
	
	
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	List<WebElement> firstBusName = driver.findElements(By.xpath("//h2[@class='TravelAgntNm ng-binding']"));
	System.out.println(firstBusName.get(0).getText());
	
	driver.findElement(By.id("Bustypes4")).click();
	driver.findElement(By.linkText("Modify Search")).click();
	WebElement name2=driver.findElement(By.xpath("//p[text()='27 Seats Available']"));
	name2.click();
	String name3=name2.getText();
	System.out.println("name of first resulting bus seat: "+name3);
	
driver.findElement(By.xpath("//span[text()='Select Seat']")).click();

driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
System.out.println(driver.findElement(By.xpath("//span[@id='seatnos']")).getText());

System.out.println(driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());


WebElement bP = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
Select bpDD = new Select(bP);
bpDD.selectByIndex(5);
WebElement dP = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
Select dpDD = new Select(dP);
dpDD.selectByIndex(2);
System.out.println(driver.getTitle());
Thread.sleep(4000);
driver.close();





     
}
}

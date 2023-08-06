package assignmentFridayFour;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class pvR {

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.pvrcinemas.com/");
			
			driver.findElement(By.className("nav-icon")).click();
			driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
			Select cityDD = new Select(driver.findElement(By.xpath("//select[@name='city']")));
			cityDD.selectByVisibleText("Chennai");

//			04) Select the Genre-->Animation
			Select genre = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
			genre.selectByVisibleText("ROMANCE");

//			05) Select the Language-->english
			Select language = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
			language.selectByVisibleText("ENGLISH");
			driver.findElement(By.xpath("//button[text()='Apply']")).click();
			Thread.sleep(9000);

			List<WebElement> firstResult = driver.findElements(By.xpath("//div[@class='movie-wrapper ng-star-inserted']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", firstResult.get(0));
			driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();


			Select cinema = new Select(driver.findElement(By.xpath("//select[@id='cinemaName']")));
			cinema.selectByVisibleText("PVR Grand Galada Chennai");

			driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
			driver.findElement(By.xpath("//span[text()='27']")).click();

			Select timings = new Select(driver.findElement(By.xpath("//select[@name='timings']")));
			timings.selectByVisibleText("06:00 PM - 09:00 PM");

			driver.findElement(By.name("noOfTickets")).sendKeys("2");

			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("So_z6");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("So_z6@gmail.com");

			driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("3425744744");

			Select fnB = new Select(driver.findElement(By.xpath("//select[@name='food']")));
			fnB.selectByVisibleText("Yes");

			driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Family popcorn");
			driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
			driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
			driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
			driver.findElement(By.className("swal2-close")).click();
			System.out.println("Title of Page: " + driver.getTitle());

		}

	}



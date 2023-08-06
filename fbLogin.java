

	
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class fbLogin {

		public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			driver.findElement(By.name("firstname")).sendKeys("Jk");
			driver.findElement(By.name("lastname")).sendKeys("apper");
			driver.findElement(By.name("reg_email__")).sendKeys("9876543211");
			driver.findElement(By.id("password_step_input")).sendKeys("youTooBrutus");
			WebElement bD = driver.findElement(By.name("birthday_day"));
			Select bdateDD = new Select(bD);
			bdateDD.selectByValue("2");
			WebElement bM = driver.findElement(By.name("birthday_month"));
			Select bmonthDD = new Select(bM);
			bmonthDD.selectByValue("10");
			WebElement bY= driver.findElement(By.name("birthday_year"));
			Select byearDD = new Select(bY);
			byearDD.selectByValue("1908");
			driver.findElement(By.xpath("//label[text()='Female']")).click();

		}

	}



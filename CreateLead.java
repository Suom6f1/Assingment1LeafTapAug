package assimentJavaLeafTaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		//Enter password as DemoSalesManager
		username.sendKeys("DemoSalesManager");
		//Locate password field
		WebElement password = driver.findElement(By.id("password"));
		//Enter password as crmsfa
		password.sendKeys("crmsfa");
		//Click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		//Click on the create lead 
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		Thread.sleep(1000);
		//Enter companyName as TestLeaf
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Al oud  ");
		WebElement foreName = driver.findElement(By.id("createLeadForm_firstName"));
		foreName.sendKeys(" Zaineh ");
		WebElement surName = driver.findElement(By.id("createLeadForm_lastName"));
		surName.sendKeys("Al Asheriff ");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys(" Marketing ");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("According to one of the most important rules of marketing, a seller should not offer their clients a product, or rather a feeling, experience or dream which the product can accomplish. This rule is well known to perfume manufacturers who certainly do not offer water that smells like orange and ginger but “an oriental and tropical sensation that every strong man who wants to keep it natural needs.” So what is the purpose of the descriptions on perfume products and why is the art of creating fancy product descriptions developing so significantly in this sector?");
		WebElement emailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailId.sendKeys("Fawaz.sheriff12001@gmail.com");
		
		WebElement firstName = driver.findElement(By.name("firstNameLocal"));
		firstName.sendKeys("Fahad");
		WebElement lastName = driver.findElement(By.name("lastNameLocal"));
		lastName.sendKeys("Sheriff");
		
		WebElement industryDD= driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDroDrown=new Select(industryDD);
		
		industryDroDrown.selectByIndex(1);
		
		WebElement ownerDD= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerDroDrown=new Select(ownerDD);
		
		ownerDroDrown.selectByVisibleText("Sole Proprietorship");
		
		WebElement markDD= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markDroDrown=new Select(markDD);
		markDroDrown.selectByValue("9002");
		WebElement StateP= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(StateP);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();

		String expectedTitle = "View Lead | opentaps CRM";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Expected result page is displayed");
		} else {
			System.out.println("Expected result page is not displayed");
		
	}
	}
}

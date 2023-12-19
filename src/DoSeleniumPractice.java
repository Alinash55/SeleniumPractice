import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoSeleniumPractice {

	private Robot robot;

	public void ProcessForm()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		Robot robot;
		try {
			robot = new Robot();
			for (int i=0; i<5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} 
		}catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		Actions objAct = new Actions (driver);
		objAct.scrollByAmount(0,750).build().perform();
		
		var FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Alina");
		
		var LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Shrestha");
		
		var Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("elushrestha55@gmail.com");
		
		var FemaleRadioBtn = driver.findElement(By.xpath("//label[@for=\"gender-radio-2\"]"));
		FemaleRadioBtn.click();
		
		var Mobile = driver.findElement(By.id("userNumber"));
		Mobile.sendKeys("5102001111");
		
		var DOB = driver.findElement(By.id("dateOfBirthInput"));
		DOB.click();
		
		var SelectMonth = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		SelectMonth.click();
		
		var SelectMnth = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]"));
		SelectMnth.click();
		
		var SelectYear = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[99]"));
		SelectYear.click();
		
		var SelectDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]"));
		SelectDay.click();
		
		var SubjectDrop = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		SubjectDrop.click();
		
		var Subjectdrop = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		Subjectdrop.sendKeys("c");
		
		var SelectCommerce = driver.findElement(By.id("id=\"react-select-2-option-3\""));
		SelectCommerce.click();
		
		var MusicCheckBox = driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]"));
		MusicCheckBox.click();
		
		var SportsCheckBox = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		SportsCheckBox.click();
		
		var Address = driver.findElement(By.id("currentAddress"));
		Address.sendKeys("123 ABC St");
		
		var DropContainer = driver.findElement(By.xpath("//*[@id=\'state\']/div/div[1]"));
		DropContainer.click();
		
		var SelectNcr = driver.findElement(By.xpath("//*[@id=\"react-select-3-option-0\"]"));
		SelectNcr.click();
		
		var DropContain = driver.findElement(By.xpath("//*[@id=\'city\']/div/div[1]"));
		DropContain.click();
		
		var SelectDelhi = driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]"));
		SelectDelhi.click();
			
	
		//DOB. Subjects. picture
	}
}

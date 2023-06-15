package willow.wood;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		

	}

}

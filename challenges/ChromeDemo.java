package challenges;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		
		// Headless mode
		ch.setHeadless(true);
		
		//To run in private mode
		//ch.addArguments("--incognito");
		
		//To disable automation browser running infobar
		//ch.addArguments("--disable-infobars");
		
		//To maximize the browser
		//ch.addArguments("--start-maximized");
		
		//To run the browser in full screen
		ch.addArguments("--start-fullscreen");
		
		
		ChromeDriver driver = new ChromeDriver(ch);

		driver.get("http://www.naukri.com");
		System.out.println(driver.getTitle());
	
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snaps/headless.png");
		FileUtils.copyFile(src, dec); 
	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	


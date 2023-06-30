package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	public static void capturaPrintTela(WebDriver driver, String nomePrint){
		
		//Realiza o print de tela, utilizando try/catch
				try {
				File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenShot, new File("C:\\Treinamento Selenium\\" + nomePrint + ".jpg"));
				
				System.out.println("Screenshot taken successfully!");
				
				}catch (Exception e) {
					System.out.println("Error capturing screenshot");
				}
		
	}
	
	
	
	

}

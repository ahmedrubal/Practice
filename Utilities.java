package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import trialAndError.BaseClass;

public class Utilities {
	
	
	static final int MAX_WAIT_TIME = 5;
	public static void waitForElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),MAX_WAIT_TIME);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void scrolling() {
		JavascriptExecutor jse= (JavascriptExecutor)BaseClass.getDriver();
		jse.executeScript("window.scrollBy(0,700)");
	}
	
	public static void screenShot(String shots) {
		TakesScreenshot src =((TakesScreenshot)BaseClass.getDriver());
		File sourceFile = src.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./src/test/resources/screenshots/"+shots+".png");
		try {
			FileUtils.copyFile(sourceFile, desFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


}

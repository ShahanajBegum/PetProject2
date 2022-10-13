package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Screenshots implements FrameWorkConstants {

	
		public static void getPhoto(WebDriver driver) {		
			LocalDateTime systemDate = LocalDateTime.now();
			String ScreenShotDate = systemDate.toString().replaceAll(":", "-");
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File tempFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(SCREENSHOT_PATH + ScreenShotDate + ".png");
			try {
				FileUtils.copyFile(tempFile, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}



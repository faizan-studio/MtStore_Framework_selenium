package com.Mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Mystore.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestcases {

	Readconfig rs = new Readconfig();
	String url = rs.getbaseurl();
	String browser = rs.getbrowser();

	public static  WebDriver dr;

	@BeforeClass
	public void setup()	{
			
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		

		
		dr.get(url);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterClass 
	public void timeend() {
		dr.close();
		dr.quit();
	}

	public void CaptureScreenShot( WebDriver dr , String testname) throws IOException {

		TakesScreenshot Screenshot = ((TakesScreenshot)dr);

		File src = Screenshot.getScreenshotAs(OutputType.FILE);
		File dst = new File(System.getProperty("user.dir") +"//Screenshots//" + testname + ".png");
		FileUtils.copyFile(src, dst);
	}



}

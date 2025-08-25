package javawork;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zone3 {

	public static WebDriver callBrowser(String browserName) {

		WebDriver driver = null;
		switch (browserName.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Browser not supported");
		}

		return driver;
	}

	public static void main(String[] args) {
		System.out.println("enter the browser name edge or chrome");
		Scanner scanner = new Scanner(System.in);
		String browserName = scanner.nextLine();
		scanner.close();
		WebDriver driver = Zone3.callBrowser(browserName);

		if (driver != null) {
			driver.get("https://www.google.com/");
			driver.quit();

		}
	}
}

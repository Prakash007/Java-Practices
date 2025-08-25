package javawork;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Zone1 {

	public static void browsercall(String browserName) {
		if (browserName.equalsIgnoreCase("edge")) {
			WebDriver edgedriver = new EdgeDriver();
			edgedriver.get("https://www.google.com/");
			edgedriver.quit();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriver chromedriver = new ChromeDriver();
			chromedriver.get("https://www.google.com/");
			chromedriver.quit();
		} else {
			System.out.println("Browser not found");
		}
	}

	public static void main(String[] args) {

		System.out.println("enter the browser name edge or chrome");
		Scanner scanner = new Scanner(System.in);
		String browserName = scanner.nextLine();
		scanner.close();
		Zone1.browsercall(browserName);

	}

}

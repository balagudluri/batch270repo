package tests;
import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		sc.close();
		
		
		RemoteWebDriver driver = null;
		if(bn.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("wrong browser name");
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		
		System.out.println("The title is "+title);
		
		
		

	}

}

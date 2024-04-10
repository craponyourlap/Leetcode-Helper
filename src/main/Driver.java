package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.InputProcessor.InputException;

public class Driver {

	public static void main(String[] args) throws InputException {
		// TODO Auto-generated method stub
		String userDir = System.getProperty("user.dir");
		String path_chromeDriver = userDir + "/src/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path_chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://leetcode.com/accounts/login/");
	}
	
}

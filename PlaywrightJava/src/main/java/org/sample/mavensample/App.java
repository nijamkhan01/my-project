package org.sample.mavensample;

import java.nio.file.*;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.*;

/**
 * Hello world!
 *
 */
public class App
{
	 public static void main(String[] args) {
//	        try (Playwright playwright = Playwright.create()) {
//	            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//	            Page page = browser.newPage();
//	            page.navigate("https://www.google.com");
//	            System.out.println(page.title());
//	            page.screenshot(new ScreenshotOptions().setPath(Paths.get("example.org")));
//	        }
	        try (Playwright playwright=Playwright.create()){
	        	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        	Page page=browser.newPage();
	        	page.navigate("https://www.youtube.com/");
	        	System.out.println(page.title());
	        	page.screenshot(new ScreenshotOptions().setPath(Paths.get("Example1.png")));
	        	BrowserContext context=browser.newContext();
	        	page.evaluate("() => document.documentElement.requestFullScreen()");
	        	
	        }
	 }
}

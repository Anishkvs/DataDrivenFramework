package com.w2a.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

import page.object.practice.AlertPage;
import page.object.practice.MouseHoverPage;
import page.object.practice.iFramePage;

public class PracticeTest2 extends TestBase {

	public WebDriver driver;
	
	@Test
	public void run() throws InterruptedException {
		
		
		
		MouseHoverPage mouse = new MouseHoverPage();
		Thread.sleep(5000);
		mouse.getScrollDown();
		Thread.sleep(5000);
		mouse.getMouseHover();
		Thread.sleep(5000);
		//mouse.getSubMenu();

		iFramePage frame = new iFramePage();
		frame.getScrollDownToIFrame();
		Thread.sleep(5000);
		frame.getswitchToIFrame();
		Thread.sleep(5000);
		frame.getScrollDownWithInIFrame();
		Thread.sleep(5000);
		frame.getClickOnIframeLogin();
		Thread.sleep(5000);
		
		
		
	
	
	}

	
}

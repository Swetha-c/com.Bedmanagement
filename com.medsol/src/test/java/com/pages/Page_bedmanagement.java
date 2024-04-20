package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_bedmanagement extends Baseclass {
	public Page_bedmanagement(WebDriver driver) {
		this.driver = driver;
	}

	public void bedmanagement_select() throws InterruptedException {
		By element = By.xpath(loc.getProperty("bedmanagement"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement bed = wait.until(ExpectedConditions.elementToBeClickable(element));
		bed.click();
		Thread.sleep(1000);

	}

	public void bedtype_new() throws InterruptedException {

		driver.findElement(By.xpath(loc.getProperty("newbedtype"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("bedtype"))).sendKeys(data.getProperty("bedtype"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("bedtypedescription"))).sendKeys(data.getProperty("bedtypedescription"));
		driver.findElement(By.xpath(loc.getProperty("bedtypesave"))).click();

	}

	public void bedtype_search() throws InterruptedException {
		WebElement search = driver.findElement(By.xpath(loc.getProperty("searchbedtype")));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		search.sendKeys("test_1");
		Thread.sleep(1000);

	}

	public void bedtype_edit() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("editbedtype"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("editbedtypedetails"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("BedTypeEditDetail"))).clear();
		driver.findElement(By.xpath(loc.getProperty("BedTypeEditDetail"))).sendKeys(data.getProperty("BedTypeEditDetail"));
		driver.findElement(By.xpath(loc.getProperty("BedTypeEditDescription"))).clear();
		driver.findElement(By.xpath(loc.getProperty("BedTypeEditDescription"))).sendKeys(data.getProperty("BedTypeEditDescription"));
		driver.findElement(By.xpath(loc.getProperty("BedTyeBtnEditSave"))).click();

		driver.navigate().back();

		// driver.findElement(By.xpath(loc.getProperty("backbedtypedetail"))).click();
		Thread.sleep(1000);

	}

	public void bedtype_delete() throws InterruptedException {

		driver.findElement(By.xpath(loc.getProperty("deletebedtype1"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("yesdeletebedtype1"))).click();
		Thread.sleep(1000);
	}

}

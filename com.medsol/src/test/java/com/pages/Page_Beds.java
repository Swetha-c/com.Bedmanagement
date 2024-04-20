package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Beds extends Baseclass {
	public Page_Beds(WebDriver driver) {
		this.driver = driver;
	}

	public void Beds_select() throws InterruptedException {
		By element = By.xpath(loc.getProperty("bedmanagement"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement bed = wait.until(ExpectedConditions.elementToBeClickable(element));
		bed.click();
		Thread.sleep(1000);

		WebElement Bed1 = driver.findElement(By.xpath(loc.getProperty("Beds")));
		Actions act = new Actions(driver);
		act.moveToElement(Bed1).click().build().perform();
		Thread.sleep(2000);
	}

	public void newbed() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("actions"))).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(loc.getProperty("newbed"))).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(loc.getProperty("bed"))).sendKeys(data.getProperty("bed"));
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc.getProperty("bedtypeselect"))).click();

		WebElement bedType = driver.findElement(By.xpath(loc.getProperty("bedtypeselect1")));
		Thread.sleep(1000);
		bedType.sendKeys(data.getProperty("selectbedtype"));
		Thread.sleep(1000);
		bedType.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath(loc.getProperty("charge1"))).sendKeys(data.getProperty("charge1"));

		driver.findElement(By.xpath(loc.getProperty("BedDescription1"))).sendKeys(data.getProperty("BedDescription1"));

		driver.findElement(By.xpath(loc.getProperty("bedsave"))).click();
		Thread.sleep(3000);

	}

	public void newbedbulk() throws InterruptedException {

		driver.findElement(By.xpath(loc.getProperty("actions"))).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(loc.getProperty("NewBedBulk"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc.getProperty("selectbed1"))).sendKeys(data.getProperty("selectbed1"));
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc.getProperty("bedtypeselect2"))).click();

		WebElement bedType = driver.findElement(By.xpath(loc.getProperty("bedtypeselect3")));
		Thread.sleep(1000);
		bedType.sendKeys(data.getProperty("selectbedtype1"));
		Thread.sleep(1000);
		bedType.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath(loc.getProperty("charge2"))).sendKeys(data.getProperty("charge2"));
		driver.findElement(By.xpath(loc.getProperty("BedBulkDescription2")))
				.sendKeys(data.getProperty("BedBulkDescription2"));
		Thread.sleep(2000);

		// driver.findElement(By.xpath(loc.getProperty("AddBedBulk"))).click();
		// Thread.sleep(2000);

		// driver.findElement(By.xpath(loc.getProperty("selectbed2"))).sendKeys(data.getProperty("selectbed2"));
		// Thread.sleep(1000);

		// driver.findElement(By.xpath(loc.getProperty("bedtypeselect4"))).click();

		// WebElement bedType1 =
		// driver.findElement(By.xpath(loc.getProperty("bedtypeselect5")));
		// Thread.sleep(1000);
		// bedType.sendKeys(data.getProperty("selectbedtype2"));
		// Thread.sleep(1000);
		// bedType1.sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath(loc.getProperty("charge2"))).sendKeys("2000");
		// driver.findElement(By.xpath(loc.getProperty("BedBulkDescription2"))).sendKeys("testing
		// purpose");

		driver.findElement(By.xpath(loc.getProperty("SaveBedBulk"))).click();
		Thread.sleep(2000);

	}

	public void bed_search() throws InterruptedException {
		WebElement search = driver.findElement(By.xpath(loc.getProperty("searchbedtype")));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		search.sendKeys(data.getProperty("search"));
		Thread.sleep(1000);

	}

	public void bed_edit() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("EditBedType1Details"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("EditBedType2Details"))).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath(loc.getProperty("BedTypeedit01"))).clear();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath(loc.getProperty("BedTypeedit01"))).sendKeys(data.getProperty("BedTypeedit01"));
		// Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("BedTypeDescription01"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("BedTypeDescription01")))
				.sendKeys(data.getProperty("BedTypeDescription01"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("BedTypeSave01"))).click();
		Thread.sleep(2000);

		driver.navigate().back();

	}

	public void bed_delete() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("deletebed"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("yesdeletebed"))).click();

	}

}

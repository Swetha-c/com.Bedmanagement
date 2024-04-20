package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.Page_Beds;
import com.pages.Page_login;

public class Tc_beds {
	Baseclass base = new Baseclass();

	@BeforeTest
	public void launch() throws IOException {
		base.setup();
	}

	@Test(priority = 1)

	public void login() throws InterruptedException {
		Page_login login = new Page_login(base.getdriver());
		login.login();
	}

	@Test(priority = 2)

	public void beds() throws InterruptedException {
		Page_Beds bed = new Page_Beds(base.getdriver());
		bed.Beds_select();
		bed.newbed();
		bed.newbedbulk();
		bed.bed_search();
		bed.bed_edit();
		bed.bed_delete();

	}
	
	@AfterTest
	public void close() {
		base.teardown();
	}

}

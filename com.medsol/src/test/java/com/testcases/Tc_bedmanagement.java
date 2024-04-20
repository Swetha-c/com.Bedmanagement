package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.Page_bedmanagement;
import com.pages.Page_login;

public class Tc_bedmanagement {
	Baseclass base = new Baseclass();

	@BeforeTest
	public void url_launch() {
		try {
			base.setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		Page_login login = new Page_login(base.getdriver());
		login.login();

	}

	@Test(priority = 2)

	public void bedmanagement() throws InterruptedException {
		Page_bedmanagement bed = new Page_bedmanagement(base.getdriver());
		bed.bedmanagement_select();
		bed.bedtype_new();
		bed.bedtype_search();
		bed.bedtype_edit();
		bed.bedtype_delete();
	}

	@AfterTest
	public void close() {
		base.teardown();
	}
}

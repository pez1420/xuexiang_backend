package com.leebbs.admin.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leebbs.admin.entity.Country;
import com.leebbs.admin.service.CountryService;

public class TestCountry {
	protected static CountryService countryService;
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {
		 try {
			 ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml",
					 "applicationContext-mybatis.xml"});
			 countryService = (CountryService)cxt.getBean("countryServiceImpl");
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	
	@Test
	public void save() {
		Country country = new Country();
		country.setName("America");
		this.countryService.save(country);
	}
}

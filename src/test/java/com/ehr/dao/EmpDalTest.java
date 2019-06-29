package com.ehr.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ehr.RunApp;
import com.ehr.service.EmpSalaryService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=RunApp.class)
public class EmpDalTest {
	@Autowired
	EmpSalaryService empSalaryService;
	@Test
	public void selectAll() throws Exception{
		empSalaryService.selectAll().forEach(e->{
			System.err.println(e.getEmpId());
		});
	}
}

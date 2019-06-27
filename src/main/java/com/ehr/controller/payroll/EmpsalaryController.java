package com.ehr.controller.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payroll/empsalary")
public class EmpsalaryController {
		@RequestMapping("")
		public String empSalary() {
			System.out.println("员工薪资表");
			return "/Payroll/empSalary/empSalary";
		}	
}

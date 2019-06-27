package com.ehr.controller.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payroll/salarylist")
public class SalaryListController {
	@RequestMapping("")
	public String salaryLever() {
		return "/Payroll/salaryList/salaryList";
	}
}

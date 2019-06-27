package com.ehr.controller.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payroll/salarylever")
public class SalaryLeverController {
	@RequestMapping("")
	public String salaryLever() {
		return "/Payroll/salaryLever/salaryLever";
	}
}

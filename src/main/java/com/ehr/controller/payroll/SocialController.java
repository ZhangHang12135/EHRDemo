package com.ehr.controller.payroll;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehr.service.CompanyService;

@Controller
@RequestMapping("/payroll/social")
public class SocialController {
	@Autowired
	SocialService socialService;
	@RequestMapping("")
	public String social() {
		return "/Payroll/social/social";
	}
	@RequestMapping("/socialList")
	public Map<String, Object> socialList(Integer pageNumInteger,Integer pageSize){
	      Map<String,Object> map = new HashMap<>();
	      map.put("code",0);
	      map.put("data",socialService.selectAll());
	      map.put("count",socialService.selectAll().size());
	      System.err.println("==================");
	      System.err.println(map.toString());
	      return map;
	}
}

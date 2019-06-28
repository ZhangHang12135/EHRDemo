package com.ehr.controller.payroll;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.service.SocialService;

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
	@ResponseBody
	public Map<String, Object> socialList(Integer pageNum,Integer pageSize){
          if(pageNum==null){
             pageNum=1;
          }
          if(pageSize==null){
             pageSize=10;
          }
	      Map<String,Object> map = new HashMap<>();
	      map.put("code",0);
	      map.put("data",socialService.pageList(pageNum, pageSize));
	      map.put("count",socialService.pageList(pageNum, pageSize));
	      return map;
	}
	@RequestMapping("deletesocial")
	@ResponseBody
    public Map<String,Object> deleteASocial(Integer Id){
		System.err.println(Id);
        Map<String,Object> map = new HashMap<>();
        socialService.deleteByPrimaryKey(Id);
        map.put("msg","deleteOK");
        return map;
    }
}

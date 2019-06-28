package com.ehr.dao;






import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ehr.RunApp;
import com.ehr.model.Social;
import com.ehr.service.SocialService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=RunApp.class)
public class SocialTest {
	@Autowired
	SocialService socialService;
	@Test
	public void queryAll() throws Exception {
		System.err.println("TEST-------");
		socialService.selectAll();
		for (Social social : socialService.selectAll()) {
			System.err.println("--------");
			System.err.println(social.getPurchaserate());
			System.err.println("--------");
		}
	}
	@Test
	public void insertSocial() throws Exception {
		Social social = new Social();
		social.setId(8);
		social.setLogictodelete(1);
		social.setPurchaserate(11);
		for (int i = 0; i < 10; i++) {
			socialService.insert(social);
		}
		System.err.println("Insert ----");
	}
	@Test
	public void deleteSocial() throws Exception {
		int id = socialService.deleteByPrimaryKey(23);
		System.out.println("delete -----"+id);
	}
	@Test
	public void selectSocialBykey() throws Exception {
		Social social = socialService.selectByPrimaryKey(2);
		System.err.println(social.getId());
		System.err.println(social.getPurchaserate());
		System.err.println(social.getLogictodelete());
	}
	@Test
	public void page() throws Exception {
		int pageNum = 1;
		int pageSize = 10;
		System.out.println(socialService.pageList(pageNum, pageSize));
	}
}

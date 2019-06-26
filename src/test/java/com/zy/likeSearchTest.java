package com.zy;
import com.ehr.RunApp;
import com.ehr.dao.CompanyDao;
import com.ehr.model.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Zy
 * @date 25/06/2019 11:00 AM
 */


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RunApp.class)
public class likeSearchTest {

    @Autowired
    CompanyDao companyDao;

    @Test
    public void test1(){
        List<Company> list = companyDao.likeSearch("1","");
        list.forEach(e-> System.err.println(e.toString()) );
    }

    @Test
    public void test2(){
        List<Company> list = companyDao.likeSearch("","2");
        list.forEach(e-> System.err.println(e.toString()) );
    }

    @Test
    public void test3(){
        List<Company> list = companyDao.likeSearch("1","2");
        list.forEach(e-> System.err.println(e.toString()) );
    }

    @Test
    public void test4(){
        List<Company> list = companyDao.likeSearch("","");
        list.forEach(e-> System.err.println(e.toString()) );
    }



}

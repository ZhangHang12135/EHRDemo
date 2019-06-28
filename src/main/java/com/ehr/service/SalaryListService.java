package com.ehr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ehr.model.SalaryList;
import com.github.pagehelper.PageInfo;

@Service
public interface SalaryListService {
	public int deleteByPrimaryKey(Integer id);
	public SalaryList selectByPrimaryKey(Integer id);
	public int updateByPrimaryKey(Integer id);
	public List<SalaryList> selectAll();
	PageInfo<SalaryList> pageList(Integer pageNum,Integer pageSize);
}

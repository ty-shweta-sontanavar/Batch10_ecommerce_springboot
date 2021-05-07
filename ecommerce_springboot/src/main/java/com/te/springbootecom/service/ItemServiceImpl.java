package com.te.springbootecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springbootecom.dao.ItemDAO;
import com.te.springbootecom.dto.ItemBean;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDAO dao;

	public ItemBean getEmpData(Integer aid) {
		return dao.getEmpData(aid);
	}

	public boolean addItem(ItemBean Bean) {
		return dao.addItem(Bean);
	}

	public boolean updateItem(ItemBean infoBean) {
		return dao.updateItem(infoBean);
	}

	@Override
	public boolean deleteItem(Integer id) {
		return dao.deleteItem(id);
	}

	@Override
	public List<ItemBean> getAllEmployeeDetails() {
		return dao.getAllEmployeeDetails();
	}

}

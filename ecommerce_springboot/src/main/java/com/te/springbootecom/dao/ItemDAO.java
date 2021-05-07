package com.te.springbootecom.dao;

import java.util.List;

import com.te.springbootecom.dto.ItemBean;

public interface ItemDAO {

	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);

	public boolean updateItem(ItemBean infoBean);

	public boolean deleteItem(Integer id);

	public List<ItemBean> getAllEmployeeDetails();

}

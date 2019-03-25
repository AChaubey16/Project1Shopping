package com.lotus.Project1Backend.dao;

import java.util.List;

import com.lotus.Project1Backend.dto.Category;

public interface CategoryDAO {
  
	Category get(int id);
	List<Category> list();
	boolean add(Category Category);
	boolean update(Category category);
	boolean delete(Category category);
	
}

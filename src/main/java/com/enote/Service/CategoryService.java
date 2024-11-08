package com.enote.Service;

import com.enote.Entity.Category;

import java.util.List;

public interface CategoryService {


    public Boolean addCategory(Category category);

    public List<Category> getAllCategorys();
}

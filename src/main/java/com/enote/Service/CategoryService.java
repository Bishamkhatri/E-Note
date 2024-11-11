package com.enote.Service;

import com.enote.Entity.Category;
import com.enote.dto.CategoryDto;
import com.enote.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {


    public Boolean addCategory(CategoryDto categoryDto);

    public List<CategoryDto> getAllCategorys();

    public List<CategoryResponse> getActiveCategory();
}

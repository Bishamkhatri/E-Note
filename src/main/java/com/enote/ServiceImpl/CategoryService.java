package com.enote.ServiceImpl;

import com.enote.Entity.Category;
import com.enote.Repository.CategoryRepository;
import com.enote.dto.CategoryDto;
import com.enote.dto.CategoryResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.List;

@Service
public class CategoryService implements com.enote.Service.CategoryService {

    //Autowire CategoryRepository bean
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    ModelMapper mapper;
    //Save category
    @Override
    public Boolean addCategory(CategoryDto categoryDto) {

        Category category = mapper.map(categoryDto,Category.class);
        category.setIsDelete(false);
        category.setCreatedOn(1);
        category.setCreatedDate(new Date());
      Category saveCategory = categoryRepository.save(category);
      if (ObjectUtils.isEmpty(saveCategory)) {
          return false;
      }
      return true;
    }

    //Get category
    @Override
    public List<CategoryDto> getAllCategorys() {
       List<Category> categories = categoryRepository.findAll();
       List<CategoryDto> categoryDtoList = categories.stream().map(cat -> mapper.map(cat,CategoryDto.class)).toList();
        return categoryDtoList;
    }

    @Override
    public List<CategoryResponse> getActiveCategory() {
         List<Category> categories = categoryRepository.findByIsActiveTrue();
        List<CategoryResponse> categoryResponseList = categories.stream().map(cat -> mapper.map(cat, CategoryResponse.class)).toList();
         return categoryResponseList;
    }
}

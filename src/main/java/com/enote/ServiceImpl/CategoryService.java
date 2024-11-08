package com.enote.ServiceImpl;

import com.enote.Entity.Category;
import com.enote.Repository.CategoryRepository;
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

    //Save category
    @Override
    public Boolean addCategory(Category category) {
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
    public List<Category> getAllCategorys() {
       List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}

package com.enote.Controller;

import com.enote.Entity.Category;
import com.enote.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    //Handler For Saving the Category
    @PostMapping("/save-category")
    public ResponseEntity<?> saveCategory(@RequestBody Category category){
            Boolean saveCate = categoryService.addCategory(category);

           if(saveCate){
               return new ResponseEntity<>("Save Success", HttpStatus.CREATED);
           }else {
               return new ResponseEntity<>("Something went Wrong", HttpStatus.INTERNAL_SERVER_ERROR);
           }
    }
    //Handler For Getting All Category
    @GetMapping("/GetAll-Categorys")
    public ResponseEntity<?> getAllCategory(){

        List<Category> category = categoryService.getAllCategorys();
        if (CollectionUtils.isEmpty(category)){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(category,HttpStatus.OK);
    }


}

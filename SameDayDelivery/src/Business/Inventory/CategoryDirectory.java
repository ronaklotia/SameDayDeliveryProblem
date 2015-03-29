/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class CategoryDirectory {

    private ArrayList<Category> categoryList;

    public CategoryDirectory() {
        categoryList = new ArrayList<>();
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }
    
    public Category createAndAddCategory(){
        Category c = new Category();
        categoryList.add(c);
        return c;
    }

}

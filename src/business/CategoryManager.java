package business;

import core.logger.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    List<Category> categories = new ArrayList<>();

    public  CategoryManager(CategoryDao categoryDao, Logger[] loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        for (Category category1 : categories){
            if (category1.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Kategori ismi tekrar edemez.");
            }
        }
        categories.add(category);
        categoryDao.add(category);


        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }

    public void delete(Category category){
        categoryDao.delete(category);
        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }

    public void update(Category category){
        categoryDao.update(category);
        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }
}

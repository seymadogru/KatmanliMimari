package dataAccess;

import entities.Category;
import entities.Instructor;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
    List<Category> getAll();
}

package dataAccess;

import entities.Category;
import entities.Instructor;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına kategori eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("JDBC ile veritabanından kategori silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC ile veritabanındaki kategori güncellendi.");
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}

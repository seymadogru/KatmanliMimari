package dataAccess;

import entities.Course;

import java.util.List;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına kurs eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile veritabanından kurs silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile veritabanındaki kurs güncellendi.");
    }

    @Override
    public List<Course> getAll() {
        return null;
    }


}

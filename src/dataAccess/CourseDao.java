package dataAccess;

import entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    void update(Course course);
    List<Course> getAll();
}

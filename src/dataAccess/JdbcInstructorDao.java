package dataAccess;

import entities.Instructor;

import java.util.List;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eğitmen eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile veritabanından eğitmen silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile veritabanındaki eğitmen güncellendi.");
    }

    @Override
    public List<Instructor> getAll() {
        return null;
    }
}

package dataAccess;

import entities.Instructor;

import java.util.List;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eğitmen eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile veritabanından eğitmen silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile veritabanındaki eğitmen güncellendi.");
    }

    @Override
    public List<Instructor> getAll() {
        return null;
    }
}

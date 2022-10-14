import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logger.ConsoleLogger;
import core.logger.DatabaseLogger;
import core.logger.Logger;
import core.logger.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Instructor instructor = new Instructor(1,"Engin","Demiroğ");
        Category category = new Category(1,"Programlama");
        Course course = new Course(1,"(2022) Yazılım Geliştirici Yetiştirme Kampı - Java",5);
        //Category category1 = new Category(2,"Programlama");
        //Course course2 = new Course(1,"(2022) Yazılım Geliştirici Yetiştirme Kampı - Java",5);

        Logger[] loggers = {new DatabaseLogger()};

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category);

        //CategoryManager categoryManager2 = new CategoryManager(new HibernateCategoryDao(),loggers);
        //categoryManager.add(category1);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);

        //CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(),loggers);
        //courseManager.add(course2);
    }

}

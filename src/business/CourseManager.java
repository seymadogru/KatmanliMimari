package business;

import core.logger.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    List<Course> courses = new ArrayList<>();

    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        if(course.getPrice()<0){
            throw new Exception("Kurs fiyatını sıfırdan küçük girdiniz! Lütfen 0'dan büyük giriniz.");
        }
        for (Course course1 : courses){
            if (course1.getCourseName().equals(course.getCourseName())){
                throw new Exception("Bu isimde bir kurs bulunmakktadır. İsmi değiştiriniz.");
            }

        }
        courses.add(course);
        courseDao.add(course);

        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

    public void delete(Course course){
        courseDao.delete(course);
        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

    public void update(Course course){
        courseDao.update(course);
        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }


}

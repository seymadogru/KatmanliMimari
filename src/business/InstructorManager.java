package business;

import core.logger.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers){
            logger.log(instructor.getName());
        }
    }

    public void delete(Instructor instructor){
        instructorDao.delete(instructor);
        for (Logger logger : loggers){
            logger.log(instructor.getName());
        }
    }

    public void update(Instructor instructor){
        instructorDao.update(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getName());
        }
    }
}

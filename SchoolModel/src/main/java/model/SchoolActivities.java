package model;

import model.PersonInSchool;
import schoolactivities.PrincipalResponsibility;
import schoolactivities.Student;
import schoolactivities.TeacherResponsibility;

import java.text.MessageFormat;

public class SchoolActivities extends PersonInSchool implements TeacherResponsibility, PrincipalResponsibility, Student {

    public   PersonInSchool teacher = new PersonInSchool();
    String staffLevel = teacher.staffLevel;
    public PersonInSchool student = new PersonInSchool();


    public SchoolActivities(String name, int age, String staffLevel, String maritalStatus, String department, double salary, String courseTeaching) {
        super(name, age, staffLevel, maritalStatus, department, salary, courseTeaching);
    }

 // The subclass Constructor inherits the fields of the parent class
    public SchoolActivities(String name, int age, String department, boolean isTeacher, double salary, String maritalStatus, String staffLevel, String courseTeaching) {

        super(name, age, isTeacher,  department, salary, maritalStatus, staffLevel, courseTeaching );

    }

    public SchoolActivities(String name, int age, boolean student) {
        super(name, age, student);
    }

    public SchoolActivities() {

    }


    @Override
    public String teachCourse(String name, PersonInSchool teacher) {
        if ( teacher.isTeacher() == true) {
            return "You are to teach " + name;
        }
        return "Not a Teacher";

    }

    @Override
    public String admitStudent(int age, String name) {
        String message = null;
        if (age >= 7 && age <= 18 && name != null) {
            return (MessageFormat.format("Hello, {0} you have been admitted", name));

        }
        return "You do not meet up with the requirement";
    }

    @Override
    public String expelStudent(String name) {
        return  String.format("/s, you have been expelled", name);
    }

    @Override
    public String takeCourse(String course) {
        return "Student Takes course!";

    }

}

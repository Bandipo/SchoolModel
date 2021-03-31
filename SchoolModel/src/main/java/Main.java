import model.PersonInSchool;
import model.SchoolActivities;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args){
        //Instantiating the object Principal, Teacher, Student, Non academic staff
      PersonInSchool principal = new PersonInSchool("Bandipo Taiye", 29,"Academics","married","none",3232.33,"none");
        System.out.println(MessageFormat.format("my name is {0}, and I am the Principal", principal.getName()));

      // Instantiating the Student object with fields: name, age, student
        SchoolActivities student = new SchoolActivities("Olumide",12,true);
        System.out.println(student.takeCourse("math"));// return Take course
        System.out.println(student.getName());

      //The Principal admit student
        String principalAdmit = new SchoolActivities().admitStudent(student.getAge(), student.getName());
        System.out.println(principalAdmit);




    }
}

import model.PersonInSchool;
import model.SchoolActivities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolActivitiesTest {
    SchoolActivities sch = new SchoolActivities();
    PersonInSchool teacher = new PersonInSchool();

    @BeforeEach
    public void setup() throws Exception{
        teacher = new PersonInSchool("Bandipo Taiye",27,true,"Academics",250000,"Married","Academics","math");



    }

    @Test
    @DisplayName("Test for teach course")
    void teachCourse() {

        String actual = sch.teachCourse("maths",teacher );
        String expected = "You are to teach maths";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("test for the admit student operation")
    void admitStudent() {
        String input = "emmanuel";
        String actual = sch.admitStudent(17,"emmanuel");
        String expected = String.format("Hello, %s you have been admitted", input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test for student expulsion")
    void expelStudent() {
        String input = "Tunde";
        String actual = sch.expelStudent(input);
        String expected = String.format("/s, you have been expelled", input);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test for student to take course")
    void takeCourse() {
        String input = "Math";
        String actual = sch.takeCourse(input);
        String expected = "Student Takes course!";
        assertEquals(expected, actual);
    }
}
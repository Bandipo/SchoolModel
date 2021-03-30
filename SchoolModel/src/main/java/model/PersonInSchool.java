package model;

public class PersonInSchool {
    // the fields are declared Private to allow for Encapsulation
    private String name;
    private int age;
    public String staffLevel; //come back and change to private
    private String maritalStatus;
    private String department;
    private double salary;
    private String courseTeaching =null;
    private boolean student;
    private boolean isTeacher = true;


    //this constructor has all the class's field to be set for object that requires all fields
    public PersonInSchool(String name, int age, String staffLevel, String maritalStatus, String department, double salary, String courseTeaching){

        this.name = name;
        this.age = age;
        this.staffLevel = staffLevel;
        this.maritalStatus = maritalStatus;
        this.department = department;
        this.salary = salary;
        this.courseTeaching = courseTeaching;


    }

    //Constructor for Academics level and Non Academics;

    public PersonInSchool(String name, int age, boolean isTeacher, String department, double salary, String maritalStatus, String staffLevel, String courseTeaching){

        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.maritalStatus = maritalStatus;
        this.staffLevel= staffLevel;
        this.courseTeaching = courseTeaching;
        this.isTeacher = isTeacher;

    }
    // constructor for student
    public PersonInSchool (String name, int age, boolean student){
        this.name = name;
        this.age = age;
        this.student = student;
    }

    //non parameterised constructor is used for easy access to objects methods without need to initialize class's field
    public PersonInSchool(){

    }







    // getMethods to access the private fields

    public String getName() {
        return name;
    }

    public String getStaffLevel(){
        return staffLevel;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public String getDepartment() {
        return department;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public boolean getStudent() {
        return student;
    }

    public boolean isTeacher() {
        return isTeacher;
    }


    // Setters methods

    public void setTeacher(boolean teacher) {
        isTeacher = teacher;
    }

    public void setAge(){
        if(age<=18){
            this.age = age;
        }
    }

    public void setStaffLevel(String staffLevel) {
        this.staffLevel = staffLevel;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
}

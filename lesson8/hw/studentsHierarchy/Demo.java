package lesson8.hw.studentsHierarchy;

import java.util.Date;
import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        Course myFECourse = new Course(new Date(), "FE", 60, "Vasyl");
        Course myJavaCourse = new Course(new Date(), "Java", 60, "Andriy");
        Course[] myCourses = {myFECourse, myJavaCourse};
        Student denysStudent = createHighestParent("Denys", "Olekh", 11, myCourses);
        SpecialStudent denysSpecialStudent = createLowestChild("Denys", "Olekh", 11, myCourses, 723813519, "denysolekh123@gmail.com");
    }

    static Student createHighestParent(String firstName, String lastName, int group, Course[] courseTaken) {
        Student studentObject = new Student(firstName, lastName, group, courseTaken);
        return studentObject;
    }

    static SpecialStudent createLowestChild(String firstName, String lastName, int group, Course[] courseTaken, long secretKey, String email) {
        SpecialStudent specialStudentObject = new SpecialStudent(firstName, lastName, group, courseTaken, secretKey, email);
        return specialStudentObject;
    }

}

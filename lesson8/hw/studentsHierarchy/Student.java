package lesson8.hw.studentsHierarchy;

public class Student {
    String firstName;
    String lastName;
    int age;
    int group;
    Course[] courseTaken;

    public Student(String firstName, String lastName, int group, Course[] courseTaken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.courseTaken = courseTaken;
    }
}

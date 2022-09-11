package lesson8.hw.studentsHierarchy;

import java.util.Date;

public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;

    public Course(Date startDate, String name, int hoursDuration, String teacherName) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}

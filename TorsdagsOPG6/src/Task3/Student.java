package Task3;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses = new ArrayList<>();

    ArrayList currentCourses = new ArrayList<>();

    public Student(String name, String address) {
        super(name,address);
    }

    @Override
    public boolean addCourse(String course){
        return true;
    }


}

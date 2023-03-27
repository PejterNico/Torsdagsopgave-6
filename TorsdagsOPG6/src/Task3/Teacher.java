package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach = new ArrayList<>();

    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public boolean addCourse(String course){
        return true;
    }
}
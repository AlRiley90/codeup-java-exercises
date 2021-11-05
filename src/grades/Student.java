package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }



    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage() {
        double totalGrade = 0;
        for (int i = 0; i < grades.size(); i++) {
            totalGrade = grades.get(i) + totalGrade;

        }
        return totalGrade / grades.size();
    }

    public static void main(String[] args) {

    }
}


import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPointsList;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPointsList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.examPointsList.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }
    
    public double averageOfGrades(){
        if (this.grades.isEmpty()){
            return -1;
        }
        
        double sum = 0;
        for (int grade : this.grades){
            sum+=grade;
        }
        double average = sum/(this.grades.size());
        return average;
    }
    
    public double averageOfPoints(){
        if (this.examPointsList.isEmpty()){
            return -1;
        }
        
        double sum = 0;
        for (int score : this.examPointsList){
            sum+=score;
        }
        double average = sum/(this.examPointsList.size());
        return average;
        
    }
}

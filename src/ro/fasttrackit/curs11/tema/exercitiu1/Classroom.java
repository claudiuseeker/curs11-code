package ro.fasttrackit.curs11.tema.exercitiu1;

import ro.fasttrackit.curs11.homework.Person;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<StudentGrade> studentGrade;

    public Classroom(){
        this(new ArrayList<>());
    }

    public Classroom(List<StudentGrade> students){
        this.studentGrade=  new ArrayList<>(students);
    }

    public List<StudentGrade> getGradesForDiscipline(String discipline){
        List<StudentGrade> gradesDiscipline = new ArrayList<>();
        if(discipline != null) {
            for (StudentGrade grade : studentGrade) {
                if (grade.getDiscipline().equalsIgnoreCase(discipline)){
                    gradesDiscipline.add(grade);
                }
            }
        }else {
            gradesDiscipline.addAll(this.studentGrade);
        }
        return gradesDiscipline;
    }
}

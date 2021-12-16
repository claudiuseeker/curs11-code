package ro.fasttrackit.curs11.tema.exercitiu1;

import ro.fasttrackit.curs11.homework.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        List<StudentGrade> studentGrade = readStudentGrades("files/grades.txt");
        System.out.println(studentGrade);
    }

    private static List<StudentGrade> readStudentGrades(String filePath) throws Exception{
        List<StudentGrade> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) !=null){
                result.add(readStudentGradesFromLine(line));
            }
        }
        return result;
    }

    private static StudentGrade readStudentGradesFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("(?=<)|(?<=>)"));

        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }

}

package com.sdajava.passexam;

/**
 * Created by lukas on 27.02.2017.
 */
public class StudentExam extends FinalExam {

    public StudentExam(String examTime, ExamStatus status) {
        super(examTime, status);
    }

    @Override
    public void examResult() {

        String student = "Student 1";
        String studentResult = "85%";

        System.out.println("To jest student: " + student  +
            "z wynikiem: " + studentResult + " status: " +getStatus()+
        " czas egzaminu: " + getExamTime());

    }
}

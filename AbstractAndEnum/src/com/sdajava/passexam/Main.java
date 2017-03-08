package com.sdajava.passexam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        DateFormat dateFormat =
            new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");

        Date date = new Date();
        String examTime = dateFormat.format(date);

        System.out.println("Data: " + examTime);

        StudentExam student1 = new StudentExam(examTime, FinalExam.ExamStatus.FAILED);
        student1.examResult();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        date = new Date();
        examTime = dateFormat.format(date);

        StudentExam student2 = new StudentExam(examTime, FinalExam.ExamStatus.FAILED);
        student2.examResult();





    }
}

package com.sdajava.passexam;

/**
 * Created by lukas on 27.02.2017.
 */
public abstract class FinalExam {

    public enum ExamStatus{
        FAILED, PASSED
    }

    private String examTime;
    private ExamStatus status;

    public FinalExam(String examTime, ExamStatus status) {
        this.examTime = examTime;
        this.status = status;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public ExamStatus getStatus() {
        return status;
    }

    public void setStatus(ExamStatus status) {
        this.status = status;
    }

    abstract public void examResult();
}

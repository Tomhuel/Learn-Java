package io.github.tomhuel.school;

public class Mark {
    private double mark = 0;
    private Subject subject;

    public Mark(double mark, Subject subject) {
        this.mark = mark;
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

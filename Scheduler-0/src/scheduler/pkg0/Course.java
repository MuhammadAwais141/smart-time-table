package scheduler.pkg0 ; 

public class Course {
    
int code ; 
String title ; 
int credit_hours ; 
String lab ; 


    public Course() {
    }

    public Course(int code, String title, int credit_hours, String lab) {
        this.code = code;
        this.title = title;
        this.credit_hours = credit_hours;
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", title=" + title + ", credit_hours=" + credit_hours + ", lab=" + lab + '}';
    }


}


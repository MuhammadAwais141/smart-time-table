package scheduler.pkg0 ; 

import java.util.ArrayList ; 

public class Semester { 
    int no ; 
    ArrayList<Course> courses ; 
    ArrayList<Section> sections ; 
    
    public Semester() {
    }
    
    public Semester(int no, ArrayList<Course> courses, ArrayList<Section> sections) {
        this.no = no ;
        this.courses = courses ;
        this.sections = sections ;
    }

    @Override
    public String toString() {
        return "Semester{" + "no=" + no + ", courses=" + courses + ", sections=" + sections + '}';
    }
    
}



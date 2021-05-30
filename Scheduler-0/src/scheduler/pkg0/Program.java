package scheduler.pkg0 ; 

import java.util.ArrayList ; 

public class Program {
    int id ; 
    String name ; 
    ArrayList<Semester> semesters ; 

    public Program(int id, String name, ArrayList<Semester> semesters) {
        this.id = id ; 
        this.name = name ; 
        this.semesters = semesters ; 
    }
    
    public Program() {
    }

}

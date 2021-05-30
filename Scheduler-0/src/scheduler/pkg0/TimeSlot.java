
package scheduler.pkg0;

public class TimeSlot { 
    int no ; 
    String duration ; 
    boolean check ; 

    public TimeSlot(int no, String duration, boolean check ) { 
        this.no = no ; 
        this.duration = duration ; 
        this.check = check ; 
    } 

    public TimeSlot() { 
    } 

    @Override
    public String toString() {
        return "TimeSlot{" + "no=" + no + ", duration=" + duration + ", check=" + check + '}'; 
    }
    
}

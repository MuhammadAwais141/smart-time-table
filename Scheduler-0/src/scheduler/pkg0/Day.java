
package scheduler.pkg0;

import java.util.ArrayList;

public class Day {
    
    int id  ; 
    String name ;
    ArrayList<TimeSlot> timeslots ; 

    public Day( int id, String name, ArrayList<TimeSlot> timeslots ) { 
        this.id = id ; 
        this.name = name ; 
        this.timeslots = timeslots ; 
    } 

    public Day() {
    }
    
    @Override
    public String toString() {
        return "Day{" + "id=" + id + ", name=" + name + ", timeslots=" + timeslots + '}';
    }

}



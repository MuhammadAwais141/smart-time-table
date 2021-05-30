

package scheduler.pkg0 ; 

import java.util.ArrayList;

public class Room {
    
    String name ; 
    boolean check ; 
    ArrayList<Day> days ; 
    
    public Room( String name, boolean check, ArrayList<Day> days ) { 
        this.name = name;
        this.check = check;
        this.days = days;
    }
    
    public Room() {
        
    }

//    public static int check_fitness(Day day) 
//    { 
//        int var = 0  ; 
//        for(int i = 0 ; i < day.timeslots.length ; i++) 
//        {
//            if(day.timeslots[i].check== false ) 
//            {
//                var++ ; 
//            }
//        }
//        return var ; 
//    }

    @Override
    public String toString() {
        
        return "Room{" + "name=" + name + ", check=" + check + ", days=" + days + '}';
//            for(int i = 0 ; i < this.days.size(); i++) 
//            {
//                System.out.println(this.days.get(i).name+"\t\t") ; 
//                for(int j = 0 ; j < this.days.get(i).timeslots.size() ; j++) 
//                { 
//                    System.out.println(this.days.get(i).name) ; 
//                    System.out.println(this.days.get(i).timeslots.get(j).no +"   "+this.days.get(i).timeslots.get(j).check ) ; 
//                }
//                System.out.println("") ; 
//            }
    }
    
    
    public void  display()
    {
        System.out.println( "Room" + "name=" + name + ", check=" + check ) ;
//        for(int k=0; k < rooms.)
//        {
            for(int i = 0 ; i < this.days.size(); i++) 
            {
                System.out.println(this.days.get(i).name+"\t\t") ; 
                for(int j = 0 ; j < this.days.get(i).timeslots.size() ; j++) 
                { 
                    System.out.println(this.days.get(i).name) ; 
                    System.out.println(this.days.get(i).timeslots.get(j).no +"   "+this.days.get(i).timeslots.get(j).check ) ; 
                }
                System.out.println("") ; 
            }

//        }
    }

}
import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    //ArrayList holding ALL students and classperiod indicating the current world's
    //period toggled by the button
    public ArrayList<Student> listOfStudents = new ArrayList<Student>();
    public int classPeriod = 2;
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    
    private void prepare(){
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Intializing all students first(also note the new parameter PERIOD*/
        DerekXu derekX = new DerekXu("Derek", "Xu", 2, 4, 2);
        NibodhVallapureddy nibodhV = new NibodhVallapureddy("Nibodh", "Vallapureddy", 1, 1, 3);
        KaifJeelani kaifjeelani = new KaifJeelani("Kaif", "Jeelani", 5,2, 2);
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 6, 1, 3);
        RidhiTamirasa rtk = new RidhiTamirasa("Ridhi", "Tamirasa", 2, 3, 3);
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 4, 1, 2);
        
        //add all students instatiated
        listOfStudents.add(derekX);
        listOfStudents.add(nibodhV);
        listOfStudents.add(kaifjeelani);
        listOfStudents.add(ericzheng);
        listOfStudents.add(rtk);
        listOfStudents.add(tanishbaranwal);

        addObject(new Button(), 5, 5);
        
        //uses a for loop to initiatlize Period 2 Students first(since we're the best ;p)
        for(Student x : listOfStudents){
            if(x.period == classPeriod){
                addObject(x, x.myRow, x.mySeat);
                x.sitDown();
            }
        }
    }  

}

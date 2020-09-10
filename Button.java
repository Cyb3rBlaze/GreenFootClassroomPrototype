import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the toggle button used to switch periods
 * 
 * @author Kaif Jeelani
 * @version 1.1
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private void toggleBtn(){
            Classroom world = (Classroom) getWorld();
            world.classPeriod = world.classPeriod == 3 ? 2 : 3;//ternary to switch periods
            for(Student x: world.listOfStudents){
                //loop through all students that exist and either remove them or add them
                //based on period
                if(x.period == world.classPeriod){
                    world.addObject(x, x.myRow, x.mySeat);
                }
                else{
                    world.removeObject(x);
                }
            }
    }
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this)){
            toggleBtn();
        }
    }    
}

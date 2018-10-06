import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vx=0;
    private boolean toRemove=false;
    public enemy (int v)
    {vx=v;
    }
    public void addedToWorld(World space)
    {
        setRotation(180);
    }
    public void move()
    {
        setLocation(getX()+vx,getY());
        if(getX()<-200)
        toRemove=false;
    }
    public void act() 
    {
        if(toRemove!=true)
            move();
        else
            getWorld().removeObject(this);
        eat();
    }    
     public void eat() throws java.lang.IllegalStateException{
        Actor rocket=getOneIntersectingObject(rocket.class);
        if(rocket!=null)
        {
            getWorld().removeObject(rocket);
            toRemove=true;
            System.exit(0);
        }
    }
}
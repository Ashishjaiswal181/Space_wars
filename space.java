import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{
    private int jeda=0;
    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000,550,1,false); 
        addObject(new rocket(),100,300);
        
    }
    public void act()
    {
        if(jeda>0)
        jeda--;
        else
        jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new enemy(-(5+Greenfoot.getRandomNumber(5))),getWidth()+200,py);
            int i=1;
            i=i+2;
            jeda=jeda+i;
        }
    }
}
 
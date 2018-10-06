import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color.*;
/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor 
{
    private boolean toRemove=false;
    //protected boolean intersects(Actor enemy);
    private int vx=5;
    private int score=0;
    public void addedToWorld(World space)
    {
        GreenfootImage image=new GreenfootImage(20,10);
        image.setColor(Color.CYAN);
        image.drawLine(1,3,100,5);
        setImage(image);
        Greenfoot.playSound("29.Avicii_Waiting_For_Love.mp3");
    }
    public void act() 
    {
        if(!toRemove){
            setLocation(getX()+vx,getY());
            //if(getX()>getWorld().getWidth()+200)toRemove=false;
        }else{
             getWorld().removeObject(this);
        }
        eat();
    } 
    public void eat() throws java.lang.IllegalStateException{
        Actor enemy=getOneIntersectingObject(enemy.class);
        if(enemy!=null)
        {
           getWorld().removeObject(enemy);
           score++;
           System.out.println(score);
        }   
    }
}

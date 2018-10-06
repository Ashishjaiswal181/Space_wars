import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int targetx=0,targety=0;
    private int jedi=0;
    private boolean toRemove=false;
    public void addedToWorld(World space)
    {
        targetx=getX();
        targety=getY();
    }
    public void move()
    {
        double rx=targetx-getX();
        double ry=targety-getY();
        double r=Math.sqrt(rx*rx+ry+ry);
        int bts=5;
        int posx=0,posy=0;
        if(r>bts)
        {
            posx=(int)(getX()+bts*rx/r);
            posy=(int)(getY()+bts*ry/r);
        }
        else
        {
            posx=targetx;
            posy=targety;
        }
        setLocation(posx,posy);
    }
    public void act()
    {
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            targetx=mouse.getX();
            targety=mouse.getY();
        }    
        move();
        if(jedi>0)
            jedi--;
        if(jedi==1){
            getWorld().addObject(new laser(),getX()+40,getY()+75);
            getWorld().addObject(new laser(),getX()+40,getY()-75);
        }
        if(jedi==0)
            jedi=10;
    }
}

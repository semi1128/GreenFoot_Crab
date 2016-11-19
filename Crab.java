import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
  /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge() )
        {
            turn(17);
        }
        
        if( Greenfoot.getRandomNumber(100) < 10)
        {
            turn (Greenfoot.getRandomNumber(90) - 45);         
        }
        checkKeypress();
        lookForWorm();
    }
        
    public void lookForWorm()
    {
        if( isTouching(Worm.class) ) 
        {
            removeTouching(Worm.class);
        }
    }
    public void checkKeypress()
    {
        int xpos = getX();
        int ypos = getY();
        int speed = 5;
        if ( Greenfoot.isKeyDown("up") )
        {
            setRotation(0);
            ypos -= speed;
        }
        if ( Greenfoot.isKeyDown("down") )
        {
            setRotation(180);
            ypos += speed;
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            setRotation(90);
            xpos += speed;
        }
        if ( Greenfoot.isKeyDown("left") )
        {
            setRotation(270);
            xpos -= speed;
        }
        setLocation(xpos,ypos);
    }
}

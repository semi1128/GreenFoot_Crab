import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Lobster implements Freezable
{
  private int counter = 100;
  private int counter_low = 0;
  public turtle()
  {
  }
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
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
     if( isTouching(Lobster.class) ) 
        {
            removeTouching(Lobster.class);
        }
     if( counter > 0)
     { 
         move(5);
         counter--; 
     }
     else
     {
        if(counter + counter_low == 100)
        {
            counter = 100;
            counter_low = 0;
        }
        else
        {
            counter_low++;
        }
     }
  }
  public void freeze(int count)
  {
      counter = count;
  }
}

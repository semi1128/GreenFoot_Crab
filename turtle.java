import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Lobster implements Freezable
{
  private int counter;
  public turtle()
  {
      counter = 100;
  }
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
  
     if(isAtEdge() )
        {
            turn(17);
        }
        
     if( Greenfoot.getRandomNumber(100) < 10)
       {
            turn (Greenfoot.getRandomNumber(90) - 45);         
       }
     if( counter < 0)
            super.act();
     else
            counter--; 
       move(5);
  }
  public void freeze(int count)
  {
      counter = count;
  }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400 ,1);
        
        prepare();
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    private void prepare()
    {
       addObject(counter, 60, 30);
        Crab crab = new Crab();
       addObject(new Crab(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       addObject(new Crab(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       addObject(new Crab(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       Worm worm = new Worm();
       addObject(new Worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       addObject(new Worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       addObject(new Worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       addObject(new Counter(), 60, 30); 
       addObject(new Lobster(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
       addObject(new turtle(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
}

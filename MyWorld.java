import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   Label scoreBoard = new Label("Score : 0");
   int nowcount = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        super(600, 400 ,1);
        addObject(new Crab(), 50, 50);
        addObject(new Worm(), 100, 100);
        addObject(new Lobster(), 300, 300);
        addObject(new turtle(), 100, 200);
        addObject(new Worm(), 99, 57);
        addObject(new Worm(), 299, 78);
        addObject(new Worm(), 499, 300);
        addObject(new Worm(), 388, 390);
        addObject(new Worm(), 100, 390);
        addObject(new Worm(), 150, 300);
        addObject(new Worm(), 278, 200);
        addObject(new Worm(), 500, 250);
        addObject(new Worm(), 570, 170);
        addObject(new Worm(), 420, 350);
        addObject(new Worm(), 530, 80);
        addObject(new Worm(), 400, 160);
        addObject(scoreBoard, 600, 20);
    }
    
    public void act()
    {
        scoreBoard.setText("Score : "+Crab.score);
        
        if(Crab.score % 100 == 0 &&! (nowcount == Crab.score))
        {
            addObject(new Lobster(), 200, 300);
            nowcount = Crab.score;
        }
    }
}

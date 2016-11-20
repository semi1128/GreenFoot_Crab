import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    public Label(String text)
    {
        GreenfootImage img = new GreenfootImage (text.length() * 20, 30);
        img.setColor(Color.BLACK);
        img.drawString(text, 10, 20);
        
        setImage(img);
    }
    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text, 10 ,20);
    }
}

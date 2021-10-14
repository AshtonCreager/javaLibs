import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int score;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code he
    }

    public Counter()
    {
        score = 0;
        setImage(new GreenfootImage(200,30));
        update();
    }

    public void addScore()
    {
        score++; 
        update();
    }

    public void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString("Score: " + score, 4, 20);
    }






}


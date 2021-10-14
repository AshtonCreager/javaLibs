import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Paddle paddle;
    private Counter counter;
    private Counter counter2;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        Paddle paddle1 = new Paddle("w", "s");
        addObject(paddle1, 20, 300);
        
        Paddle paddle2 = new Paddle("up", "down");
        addObject(paddle2, 780, 300);
        
        Ball ball = new Ball();
        addObject(ball, 400, 295);
        
        counter = new Counter();
        addObject(counter, 300, 35);
        
        counter2 = new Counter();
        addObject(counter2, 645, 35);
    }
   
    public void p2Score()
    {
        counter.addScore();
    }

    public void p1Score()
    {
        counter2.addScore();
    }

}

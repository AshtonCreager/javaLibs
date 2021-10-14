import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 4;
    private int dY = 4;
    private int delayTime = 0;
    private int p1Score = 0;
    private int p2Score = 0;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move();
       checkForBounce();
       isTouching();
       score();
       delayTime++;
       resetBall();
       gameOver();
    }
    

    
    public void move()
    {
        if(delayTime > 50)
        {
            setLocation(getX() + dX, getY() + dY);
        }
        
        if(p1Score == 8)
        {
            Greenfoot.stop();
        }
        
        if(p2Score == 8)
        {
            Greenfoot.stop();
        }
    }
    
    public void checkForBounce()
    {
        if(getX() <= 0 || getX() >= getWorld().getWidth()-1)
        {
            dX = -dX;
            Greenfoot.playSound("ballBounce.wav");
        }
        if(getY() <=0 || getY() >= getWorld().getHeight()-1)
        {
            dY = -dY;
            Greenfoot.playSound("ballBounce.wav");
        }
        
    }
    
    public void isTouching()
    {
        if(isTouching(Paddle.class) && getX() <= 52)
        {
            dX = 10;
            move();
            dX = 4;
            Greenfoot.playSound("ballBounce.wav");
            
        }
        
        if(isTouching(Paddle.class) && getX() >= 746)
        {
            dX = -10;
            move();
            dX = -4;
            Greenfoot.playSound("ballBounce.wav");
            
        }
        
    }

    public void resetBall()
    {
        if(getX() >= getWorld().getWidth()-1)
        {
            setLocation(400,300);
            p2Score++;
            delayTime = 0;
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.p2Score();
            
        }
        if(getX() <= 0)
        {
            setLocation(400,300);
            p1Score++;
            delayTime = 0;
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.p1Score();
            
        }
    }
    
    public void score()
    {
     if(getX() <= 1)
     {
         
     }
    }
    
    public void gameOver()
    {
        if(p1Score == 8)
        {
            setImage("player 1 win.png");
        }
        
        if(p2Score == 8)
        {
            setImage("player 2 win.png");
        }
    }
    
    
    
}

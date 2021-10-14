import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Paddle extends Actor
{
    private String upKey;
    private String downKey;
    private int moveup = -8;
    private int movedown = 8;
    
    
    public void act()
    {
        isKeyDown();
    }
    
    public Paddle (String upKey, String downKey)
    {
        this.upKey = upKey;
        this.downKey = downKey;
    }
    
    public void isKeyDown()
    {
        if(Greenfoot.isKeyDown(upKey))
        {
            setLocation(getX(), getY() + moveup);
        }
    
        if(Greenfoot.isKeyDown(downKey))
        {
            setLocation(getX(), getY() + movedown);
        }
    
    
    }
  
    
    
    
    
}

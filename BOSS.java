import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOSS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOSS extends Actor
{
    GifImage boss = new GifImage("Boss/BossIdle.gif");
    /**
     * Act - do whatever the BOSS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(boss.getCurrentImage());
    }
}

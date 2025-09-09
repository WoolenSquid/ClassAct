/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Point {
    private double x;
    private double y;
    
    public Point(int x, int y)
    {
        this.x = (double)x;
        this.y = (double)y;
    }
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double GetX()
    {
        return this.x;
    }
    
    public double GetY()
    {
        return this.y;
    }
}

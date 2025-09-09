/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(Rectangle rectangle) 
    {
        this.length = rectangle.length;
        this.width = rectangle.width;
    }
    
    public double GetWidth() 
    {
        return this.width;
    }
    
    public double GetLength() 
    {
        return this.length;
    }
}

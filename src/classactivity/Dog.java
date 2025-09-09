/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Dog {
    private String name;
    private String colour;
    
    public Dog(String name, String colour) 
    {
        this.name = name;
        this.colour = colour;
    }
    
    public String GetName() 
    {
        return this.name;
    }
    
    public String GetColour() 
    {
        return this.colour;
    }
}

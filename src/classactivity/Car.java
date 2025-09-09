/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Car {
    private String make;
    private String model;
    private String year;
    
    public Car(String make, String model, String year) {
        if (make.isEmpty()) {
            this.make = "Unknown";
        }
        
        if (model.isEmpty()) {
            this.model = "Unknown";
        }
        
        if (year.isEmpty()) {
            this.year = "Unknown";
        }
        
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String GetMake()
    {
        return this.make;
    }
    
    public String GetModel()
    {
        return this.model;
    }
    
    public String GetYear()
    {
        return this.year;
    }
}

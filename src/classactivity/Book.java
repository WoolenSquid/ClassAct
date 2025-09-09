/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }
    
    public Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String GetTitle() 
    {
        return this.title;
    }
    
    public String GetAuthor() 
    {
        return this.author;
    }
    
    public double GetPrice() 
    {
        return this.price;
    }
}

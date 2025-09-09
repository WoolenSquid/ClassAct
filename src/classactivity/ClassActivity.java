/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Activity 1
        Cat cat = new Cat();
        System.out.println(cat.GetAge());
        System.out.println(cat.GetName());
        
        // Activity 2
        Dog dog = new Dog("Bella", "Brown");
        System.out.println(dog.GetName());
        System.out.println(dog.GetColour());
        
    }
}

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
        System.out.println("----- Activity 1 -----");
        Cat cat = new Cat();
        System.out.println(cat.GetAge());
        System.out.println(cat.GetName());
        
        // Activity 2
        System.out.println("----- Activity 2 -----");
        Dog dog = new Dog("Bella", "Brown");
        System.out.println(dog.GetName());
        System.out.println(dog.GetColour());

        // Activity 3
        System.out.println("----- Activity 3 -----");
        Book book1 = new Book("Peppa Pig", "David Schuin");
        System.out.println(book1.GetTitle());
        System.out.println(book1.GetAuthor());
        
        Book book2 = new Book("Fifty shades of grey", "E.L. James", 699.99d);
        System.out.println(book2.GetTitle());
        System.out.println(book2.GetAuthor());
        System.out.println(book2.GetPrice());
        
        // Activity 4
        System.out.println("----- Activity 4 -----");
        Student student = new Student();
        System.out.println(student.GetStudentId());
        System.out.println(student.GetStudentName());
        System.out.println(student.GetStudentGrade());
    }
}

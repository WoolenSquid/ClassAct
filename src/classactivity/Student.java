/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classactivity;

/**
 *
 * @author David
 */
public class Student {
    private int studentId;
    private String studentName;
    private int grade;
    
    public Student() 
    {
        this(1,"David",12);
    }
    
    public Student(int studentId, String studentName, int grade) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
    
    public int GetStudentId() 
    {
        return this.studentId;
    }
    
    public int GetStudentGrade() 
    {
        return this.grade;
    }
    
    public String GetStudentName() 
    {
        return this.studentName;
    }
}

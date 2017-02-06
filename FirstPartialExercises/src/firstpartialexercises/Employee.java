/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Rodrigo
 */
public class Employee {
    private int id;
    private int salary;
    private String firstName;
    private String lastName;
    
    public Employee(int id,int salary,String firstName, String lastName){
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getName(){
        return this.firstName+" "+this.lastName;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public void setSalary(int Salary){
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return this.salary*12;
    }
    
    public int raiseSalary(int percentage){
        this.salary += this.salary * percentage / 100;
        return this.salary;
    }
    
    @Override
    public String toString(){
        return "Employee[id= " + this.id + ",name= " +this.getName() + ",salary= " + this.salary +"]";
    }
    
}

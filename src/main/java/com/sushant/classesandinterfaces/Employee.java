package com.sushant.classesandinterfaces;

  abstract class Person {
	private String name;
    private String gender;
     
    public Person(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }
     
    //abstract method
    public abstract void work();
     
    @Override
    public String toString(){
        return "Name="+this.name+"::Gender="+this.gender;
    }
}

 public class Employee extends Person {
    
    private int empId;
     
    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId=id;
    }
 
//    @Override
    public void work() {
        if(empId == 0){
            System.out.println("Not working");
        }else{
            System.out.println("Working as employee!!");
        }
    }
     
    public static void main(String args[]){
        //coding in terms of abstract classes
        Employee student = new Employee("Dove","Female",0);
        Employee employee = new Employee("Pankaj","Male",123);
        student.work();
        employee.work();
        //using method implemented in abstract class - inheritance
        System.out.println(employee.toString());
    }
 
}
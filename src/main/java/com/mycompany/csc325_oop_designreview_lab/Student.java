/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Jessalyn Otero
 */
public class Student extends Human{

    private double GPA;

	//Student Constructor
    public Student(String name, short age, double GPA) {
        super(name, age);
        this.GPA = GPA;
    }

	//Getters and setters
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: Name = " + getName() + ", Age = " + getAge() + ", GPA = " + GPA;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }
}

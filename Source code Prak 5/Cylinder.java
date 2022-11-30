/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author Muhammad Alghifari
 */
public class Cylinder extends Shape {
  private double radius;  //radius in feet
  private double height;  // height in feet
  public Cylinder(double r,double h) 
  {
    super("Cylinder"); 
    radius = r;
    height = h;
  }  
  public double area() 
  {
    return Math.PI*radius*radius*height;
  }
  public String toString() 
  {
    return super.toString() + " of radius " + radius + " and height " + height;
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public class CircleO extends PlaneFigure{
    private double Area;
    private double Perimeter;
    
    @Override
    public String FormulaArea(){
    return "The formula for area is : phi * r * r";
    }
    
    @Override
    public String FormulaPerimeter(){
    return "The formula for perimeter is : 2 * phi * r";
    }
    public void setArea(double r) {
        this.Area = (22* r * r)/7;
    }
    public double getArea()   {
        return Area;
    }
    public void setPerimeter(double r)    {
        this.Perimeter = (22*2*r)/7;        
    }
    public double getPerimeter()   {
        return Perimeter;        
    }
}

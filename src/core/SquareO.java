/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public class SquareO extends PlaneFigure {
    private double Area;
    private double Perimeter;
    
    @Override
    public String FormulaArea(){
    return "The formula for area is : Side x Side";
    }
    
    @Override
    public String FormulaPerimeter(){
    return "The formula for perimeter is : 4 x side";
    }

    public void setArea(double s) {
        this.Area = s*s;
    }

    public double getArea() {
        return Area;
    }

    public void setPerimeter(double s) {
        this.Perimeter = 4*s;
    }

    public double getPerimeter() {
        return Perimeter;
    }
    
    
    
}

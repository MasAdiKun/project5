/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public class RectangleO extends PlaneFigure {
    private double Area;
    private double Perimeter;

    @Override
    public String FormulaArea() {
        return "The formula for area is : Length x Width";
    }

    @Override
    public String FormulaPerimeter() {
        return "The formula for perimeter is : 2 x (Length + Width)";
    }
    
    

    public void setArea(double l, double w) {
        this.Area = l*w;
    }

    public double getArea() {
        return Area;
    }

    public void setPerimeter(double l, double w) {
        this.Perimeter = 2*(l+w);
    }

    public double getPerimeter() {
        return Perimeter;
    }
}

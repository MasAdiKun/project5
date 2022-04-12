/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public class CuboidO extends SolidFigure {
    private double SurfaceArea;
    private double Volume;
    
    @Override
    public String FormulaVolume(){
    return "The formula for volume is : L x W x H";
    }
    @Override
    public String FormulaSurfaceArea(){
    return "The formula for surface area is : 2 x (L*W + L*H"
            + " + W*H)";
    }
    
    
    public void setVolume(double l, double w, double h) {
        this.Volume = l*w*h;
    }

    public double getVolume() {
        return Volume;
    }
    public void setSurfaceArea(double l, double w, double h) {
        this.SurfaceArea = 2*(l*w+l*h+w*h);
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }
}

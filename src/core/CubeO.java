/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public class CubeO extends SolidFigure{
    private double SurfaceArea;
    private double Volume;
    
    @Override
    public String FormulaVolume(){
    return "the formula for volume is: side * side * side";
    }
    @Override
    public String FormulaSurfaceArea(){
    return "the formula for surface area is: 6 * side * side";
    }

    public void setVolume(double s) {
        this.Volume = s * s * s;
    }

    public double getVolume() {
        return Volume;
    }

    public void setSurfaceArea(double s) {
        this.SurfaceArea = 6 * s * s;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }
    
}

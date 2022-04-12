/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public class SphereO extends SolidFigure{
    private double SurfaceArea;
    private double Volume;
    
    @Override
    public String FormulaVolume(){
    return "the formula for volume is: 4/3 * phi * r * r * r";
    }
    @Override
    public String FormulaSurfaceArea(){
    return "the formula for surface area is: 4 * phi * r * r";
    }
    public void setVolume(double r)    {
        this.Volume = 4/3 *(22 * r * r *r)/7 ;        
    }
    public double getVolume(){
        return Volume;        
    }
    public void setSurfaceArea(double r) {
        this.SurfaceArea = 4 *(22* r * r)/7;
    }
    public double getSurfaceArea()   {
        return SurfaceArea;
    }
    
}

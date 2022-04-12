/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public abstract class SolidFigure extends Figure {
    abstract public String FormulaVolume();
    abstract public String FormulaSurfaceArea();
    @Override
    public String figures(){
    return "is a Three Dimension figure";
    }
}

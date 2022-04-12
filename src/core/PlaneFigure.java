/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author masad
 */
public abstract class PlaneFigure extends Figure {
    abstract public String FormulaArea();
    abstract public String FormulaPerimeter();
    @Override
    public String figures(){
    return "is a Two Dimension figure";
    }
}

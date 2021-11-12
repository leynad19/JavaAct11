/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act11;

/**
 *
 * @author danyg
 */
public class Square implements Shape{
    
    private double lado;
    
    public Square(double lado){
        this.lado = lado;
    }
    
    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return lado*4;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}

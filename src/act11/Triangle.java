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
public class Triangle implements Shape {
    
    private double Base;
    private double Altura;
    
    public Triangle(double Base,double Altura){
        this.Base = Base;
        this.Altura = Altura;
    }  

    @Override
    public double getArea() {
        return (Base * Altura) / 2.0;
    }

    @Override
    public double getPerimetro() {
        return Base * 3.0;
    }

    /**
     * @return the Lado
     */
    public double getBase() {
        return Base;
    }

    /**
     * @param Lado the Lado to set
     */
    public void setBase(double Base) {
        this.Base = Base;
    }

    /**
     * @return the Altura
     */
    public double getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
}

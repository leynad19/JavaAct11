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
public class Circle implements Shape{
    
    public static final double PI = 3.141592;
    public double radio;
    
    public Circle(double radio){
        this.radio = radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiameter() {
        return radio * 2;
    }

    @Override
    public double getArea() {
        return PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return PI* getDiameter();
    }
    
}

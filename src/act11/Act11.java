/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act11;

import java.util.Scanner;

/**
 *
 * @author danyg
 */
public class Act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimetro() {
                return 0;
            }
        };
        int valor=0,base = 0,lado = 0,altura = 0;
        int x=0;
        do {
            System.out.println("interfaces con figuras  \n "+"1 Circulo\n "+"2 Triangulo\n "+"3 cuadrado\n "+"\n "+"5 salir\n ");
            x = entrada.nextInt();

            switch (x) {
                case 1:

                    System.out.println("ingresa el valor del radio");
                    valor=entrada.nextInt();

                    Circle circulo=new Circle(valor);
                    System.out.println("Area"+circulo.getArea());
                    System.out.println(circulo.getPerimetro());


                    break;
                case 2:

                    System.out.println("ingresa el valor de la altura");
                    altura=entrada.nextInt();
                    System.out.println("ingresa el valor de la base");
                    base=entrada.nextInt();

                    Triangle triangulo =new Triangle(base,altura);
                    triangulo.setBase(valor);
                    System.out.println("Area: "+triangulo.getArea());
                    System.out.println("perimetro : "+triangulo.getPerimetro());



                    break;
                case 3:

                    System.out.println("ingresa el valor del lado del cuadro");
                    lado=entrada.nextInt();
                    Square cuadrado = new Square(lado);

                    System.out.println("Area: "+cuadrado.getArea());
                    System.out.println("perimetro : "+cuadrado.getPerimetro());


                    break;
                default:System.out.println("opcion no valida");
            }


    }while (x!=5);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcoche;

/**
 *
 * @author gaetchen
 */
public class Classcoche {
    String color;
    String marca;
    int km;

    
    public static void main(String[] args) {
    Classcoche Classcoche1 = new Classcoche ();
    
    Classcoche1.color="rojo";
    Classcoche1.marca = "audi";
    Classcoche1.km = 110;
    System.out.println("color de coche1: "+Classcoche1.color);
    System.out.println("Marca del coche: "+Classcoche1.marca);
    System.out.println("Kilometro del coche: "+Classcoche1.km);

Classcoche Classcoche2 = new Classcoche ();

Classcoche2.color="negro";
Classcoche2.marca="BMW";
Classcoche2.km=0;
System.out.println("/nEl color de coche es:"+Classcoche2.color);
System.out.println("el color de coche es:"+Classcoche2.marca);
System.out.println("el kilometro del coche:"+Classcoche2.km);
    }
}


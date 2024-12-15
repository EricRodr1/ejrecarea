/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recarea;


import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Recarea {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        //Perimetro
        System.out.print("Favor ingresar baseperimetro");
     float baseperimetro = sc.nextFloat();
     
     System.out.print("Favor ingresar alturaperimetro");
     float alturaperimetro = sc.nextFloat();
     
     float perimetro = 2*(baseperimetro + alturaperimetro);
     
     System.out.println("El perimetro de el rectangulo es: "+ perimetro);
     
     //Area
        System.out.print("Favor ingresar basearea");
     float basearea = sc.nextFloat();
     
     System.out.print("Favor ingresar alturaarea");
     float alturaarea = sc.nextFloat();
     
     float area = (basearea * alturaarea);
     
     System.out.println("El area de el rectangulo es: "+ area);
    }
}

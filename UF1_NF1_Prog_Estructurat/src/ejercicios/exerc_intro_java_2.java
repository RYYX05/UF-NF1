package ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roli1509
 */
public class exerc_intro_java_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix el radi: ");
        double r = in.nextInt();
        
        if (r < 0) {
            System.out.println("Error");
        } else {
          double a = 4 * 3.14 * (r * r);
          double v = (4.0/3.0) * 3.14 * (r * r * r);
          System.out.println("Area: " + a + "\n" + "Volumen: " + v);
          
        }
        
    }
    
}

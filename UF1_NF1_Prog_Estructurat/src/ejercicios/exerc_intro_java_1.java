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
public class exerc_intro_java_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix una temperatura en Celsius: ");
        double a = in.nextInt();
        
        if (a > 100) {
            System.out.println("Error");
        } else {
          double b = (a * 9) / 5 + 32;
          System.out.println(b);
            
        }    
    }
}

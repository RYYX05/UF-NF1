/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = in.nextInt();
        if (mayoredad(edad)== true) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }
    }
    
    public static boolean mayoredad (int a){
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
}

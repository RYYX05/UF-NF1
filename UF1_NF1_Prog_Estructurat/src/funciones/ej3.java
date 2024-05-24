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
public class ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = in.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = in.nextInt();
        System.out.println(menor(num1, num2));
    }
    public static int menor(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}

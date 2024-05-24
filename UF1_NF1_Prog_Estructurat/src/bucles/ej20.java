/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num;
        do{
            System.out.print("Introduce un número: ");
            num = in.nextInt();
            if(num<= 0 || num >= 20){
                System.out.println("Error");
            }
        } while (num <= 0 || num >= 20);
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        } 
    }
}

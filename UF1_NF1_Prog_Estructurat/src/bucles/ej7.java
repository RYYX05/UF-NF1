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
public class ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, positiu = 0, negatiu = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Introduce 10 números");
            num = in.nextInt();
            if(num<0){
                negatiu++;
            }
            else{
                positiu++;
            }
        }
        System.out.println(positiu + " son positivos i " + negatiu + " son negativos");
    }
}

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
public class ej6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 10 números: ");

      
        boolean negativo = false;
        for (int i = 1; i <= 10; i++){
            System.out.println("Introduce 10 números");
            int num = in.nextInt();
            if(num<0){
                negativo = true;
            }
        }
        if(negativo){ //equivale a negativo == true
            System.out.println("Hay negativos");
        }
        else{
            System.out.println("No hay negativos");
        }
    }
}

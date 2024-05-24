/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursitivitat;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = in.nextInt();
        int num2;
        do {
            System.out.println("Introduce el segundo numero: ");
            num2 = in.nextInt();
            if(num==num2){
                System.out.println("Son iguales");
            }
        } while (num2 == num);
        if(num2>num){
            System.out.println("La suma de todos los numeros pares = "
                + suma(num, num2));
        }else{
            System.out.println("La suma de todos los numeros pares = "
                + suma(num2, num));
        }
        
    }

    public static int suma(int num1, int num2) {
        if (num1 + 1 == num2) {
            return (num2 - num1) - 1;
        } else {
            return (num2 - 1) + suma(num1, num2 - 1);
        }
    }
}

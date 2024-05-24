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
public class ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int num = in.nextInt();
        System.out.println(dimeSigno(num));
    }
    public static int dimeSigno(int a){
        if(a>0){
            return 1;
        }else if (a<0){
            return -1;
        }else{
            return 0;
        } 
    }
}

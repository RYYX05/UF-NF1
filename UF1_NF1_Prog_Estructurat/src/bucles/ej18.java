/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author roli1509
 */
public class ej18 {
    public static void main(String[] args) {
        int resultado = 0;
        for (int i = 1; i <= 5; i++) {
            resultado+=Math.pow(i, 2);
            System.out.printf("%d+", i*i);
        }
        System.out.print("\b");
        System.out.println(" = " + resultado);
    }
}

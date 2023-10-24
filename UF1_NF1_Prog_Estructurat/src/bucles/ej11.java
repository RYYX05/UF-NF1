/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author roli1509
 */
public class ej11 {

    public static void main(String[] args) {
        //declaramos variables
        int parells = 0, imparells = 0;
        //bucle
        for (int i = 101; i < 200; i++) {
            if (i % 2 == 0) {
                parells += i;
            } else {
                imparells += i;
            }
        }
        //missatge
        System.out.printf("Suma parells: %d\nSuma imparells: %d\n",
                parells, imparells);
    }
}

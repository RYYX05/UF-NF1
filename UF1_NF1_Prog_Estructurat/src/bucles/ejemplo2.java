/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author roli1509
 */
public class ejemplo2 {

    public static void main(String[] args) {

        /*
        int parells = 0, imparells = 0;
        for (int i = 101; i < 200; i++) {
            if (i % 2 == 0) {
                parells += i; // parells = parells + 1
            } else {
                imparells += i;
            }
        }

        System.out.printf("Números compresos entre 100 i 200 \n");
        System.out.printf("La suma dels imparells és %d \n", imparells);
        System.out.printf("La suma dels parells és %d \n", parells);
         */
 /*
        int parells = 0, imparells = 0;
        int cont = 101;
        while (cont < 200) {
            if (cont % 2 == 0) {
                parells += cont; // parells = parells + 1
            } else {
                imparells += cont;
            }
            cont++;
        }
         */
        int parells = 0, imparells = 0;
        int cont = 101;
        do {
            if (cont % 2 == 0) {
                parells += cont; // parells = parells + 1
            } else {
                imparells += cont;
            }
            cont++;
        } while (cont < 200);
    }
}

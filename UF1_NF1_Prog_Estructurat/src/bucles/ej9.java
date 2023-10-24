/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author roli1509
 */
public class ej9 {

    public static void main(String[] args) {
        int suma = 0;
        int muti = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i; //suma = suma + i
            muti *= i; //muti = muti * i
        }
        System.out.printf("""
                          Suma 10 numeros naturales = %d
                          Mutiplicaci\u00f3n 10 numeros naturales = %d
                          """,
                suma, muti);
    }
}

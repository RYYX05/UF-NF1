package ejercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roli1509
 */
public class exc_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, sol;

        System.out.print("Introduce el coeficiente a: ");
        a = scanner.nextDouble();

        System.out.print("Introduce el valor b: ");
        b = scanner.nextDouble();

        System.out.print("Introduce el valor c: ");
        c = scanner.nextDouble();

        if (a != 0 && b != 0 && c != 0) {
            sol = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Es una equació de 2n grau");
            System.out.println("Solució 1 de la ecuación de segundo "
                    + "grado es: " + sol);
            sol = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Solució 2 de la ecuación de segundo "
                    + "grado es: " + sol);
        } else if (a == 0 && b != 0 && c != 0) {
            System.out.println("Es una equació de 1r grau");
            sol = -c / b;
            System.out.println("Solució de la ecuación de primer "
                    + "grau es: " + sol);
        } else if (a != 0 && b == 0 && c != 0) {
            sol = +Math.sqrt(-c / a);
            System.out.println("Es una equació de 2n grau");
            System.out.println("Solució 1 de la ecuación de segundo "
                    + "grado es: " + sol);
            sol = -Math.sqrt(-c / a);
            System.out.println("Solució 2 de la ecuación de segundo "
                    + "grado es: " + sol);
        } else if (a != 0 && b != 0 && c == 0) {
            sol = 0;
            System.out.println("Es una equació de 2n grau");
            System.out.println("Solució 1 de la ecuación de segundo "
                    + "grado es: " + sol);
            sol = -b / a;
            System.out.println("Solució 1 de la ecuación de segundo "
                    + "grado es: " + sol);
        } else {
            System.err.println(
                    "No se puede realizar el calculo con tan pocos datos");
        }

    }

}


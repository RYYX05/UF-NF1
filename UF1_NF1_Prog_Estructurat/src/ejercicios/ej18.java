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
public class ej18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Definimos variables
        String nom;
        int horas, preu_hora;
        double salari_brut, impuestos, salari_net;
        //Introducimos datos
        System.out.println("Introduce tu nombre: ");
        nom = in.nextLine();
        System.out.println("Introduce el p0recio hora: ");
        preu_hora = in.nextInt();
        //validació preu hora
        if (preu_hora <= 0) {
            System.out.println("Error");
        } else {
            System.out.println("Introduce horas trabajadas: ");
            horas = in.nextInt();
            //validación horas trabajadas
            if (horas < 0) {
                System.out.println("Error");
            } else {
                //Cálculo del salario
                if (horas <= 35) {
                    salari_brut = horas * preu_hora;
                } else {
                    salari_brut = ((35 * preu_hora) + (horas - 35) * preu_hora * 1.5);

                }
                //Cálcul de los impostos
                if (salari_brut <= 500) {
                    impuestos = 0;
                } else if (salari_brut <= 900) {
                    impuestos = (salari_brut - 500) * 0.25;
                } else {
                    impuestos = ((salari_brut - 900) * 0.45) + (400 * 0.25);
                }
                //Cálculo slario neto
                salari_net = salari_brut - impuestos;
                //Mostrar resultados
                System.out.println("Informe del salario: ");
                System.out.println("Slario brut: " + salari_brut);
                System.out.println("Tasas pagadas: " + impuestos);
                System.out.println("Slario neto: " + salari_net);
            }
        }
    }
}
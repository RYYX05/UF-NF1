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
public class ej17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce hora, minutos i segundos: ");
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();

        if (s < 59) {
            s++;
        } else {
            s = 00;
            if (m < 59) {
                m++;
            } else {
                m = 00;
                if (h < 23) {
                    h++;
                } else {
                    h = 00;
                }
            }
            System.out.println(h + "h " + m + "m " + s + "s");
        }

    }
}

/*
Scanner in = new Scanner(System.in);
int horas, minuts, segons;
System.out.print("Introduce horas: ")
horas = in.next();
System.out.print("Introduce horas: ")
minuts = in.next();
System.out.print("Introduce horas: ")
segons = in.next();



*/
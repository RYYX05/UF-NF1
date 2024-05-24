package Pe1_Examen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temporada;
        System.out.println("Quint tipus d'entrada? \n 1.- Ordinària 2.- Reduïda");
        int tipus_entrada = in.nextInt(); //assignem variable 
        if ((tipus_entrada == 1) || (tipus_entrada == 2)) {
            if (tipus_entrada == 1) {
                System.out.println("Quina temporada? \n 1.- Baixa 2.- Mitjana 3.- Alta");
                temporada = in.nextInt(); //asignem variable
                if (temporada == 1) {
                    System.out.println("Entrada ordinària en temporada baixa." + "/n"
                            + "Preu a pagar: 10.50€");
                } else if (temporada == 2) {
                    System.out.println("Entrada ordinària en temporada mitjana." + "/n"
                            + "Preu a pagar: 15.50€");
                } else if (temporada == 3) {
                    System.out.println("Entrada ordinària en temporada alta." + "/n"
                            + "Preu a pagar: 18.50€");
                } else if ((temporada != 1) || (temporada != 2) || (temporada != 3)) {
                    System.out.println("Opció incorrecte");
                }
            } else if (tipus_entrada == 2) {
                System.out.println("Quina temporada? \n 1.- Baixa 2.- Mitjana 3.- Alta");
                temporada = in.nextInt(); //asignem variable
                if (temporada == 1) {
                    System.out.println("Entrada reduïda en temporada baixa." + "/n"
                            + "Pregu a pagar: 8.00€");
                } else if (temporada == 2) {
                    System.out.println("Entrada reduïda en temporada mitjana" + "/n"
                            + "Pregu a pagar: 12.50€");
                } else if (temporada == 3) {
                    System.out.println("Entrada reduïda en temporada alta" + "/n"
                            + "Pregu a pagar: 16.20€");
                } else if ((temporada != 1) || (temporada != 2) || (temporada != 3)) {
                    System.out.println("Opció incorrecte");
                }
            }
        } else if ((tipus_entrada != 1) && (tipus_entrada
                != 2)) {
            System.out.println("Opcó incorrecte");
        }

    }
}

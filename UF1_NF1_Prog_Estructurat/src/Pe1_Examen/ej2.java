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
public class ej2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quants números vols entrar?");//Preguntem a l'usuari
        int cant_num = in.nextInt(); //assignem variable "cant_num" = Quantitat num que vol entrar
        System.out.println("Quin és el número llindar?");
        int num_llindar = in.nextInt(); //assignem variable
        int cont_num = 0, major_llindar = 0, igual_llindar = 0, entrada_num; //assignem variables 

        /*El tipus d'estructura que utilitzaré és un for 
          perque sabem quantes vegades s'ha de repetir*/
        for (int i = 0; i <= cant_num; i++) {
            System.out.print("Introdueix el número: ");
            entrada_num = in.nextInt();
            cont_num++;
            if (entrada_num < 0) {
                System.out.println("Error, número negatiu");
                cont_num--;
            }
            if (entrada_num > num_llindar) {
                major_llindar++;
            }
            if (entrada_num == num_llindar) {
                igual_llindar++;
            }
        }
        System.out.printf("Total números entrats: %d\nNúmero llindar: %d\n"
                + "Números major que el llindar: %d\n"
                + "Números igual que el llindar: %d",
                cont_num, num_llindar,
                major_llindar, igual_llindar);
    }
}

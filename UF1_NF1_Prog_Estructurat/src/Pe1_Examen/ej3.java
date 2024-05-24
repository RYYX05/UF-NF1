package Pe1_Examen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatori = new Random();
        System.out.print("Digam el límit dels nombres amb els quals farás les sumes: "); //Preguntem a l'usuari
        int num_limit = in.nextInt(); //assignem variable
        int sumes_encertades = 0; 
        int sumes_errades = 0;
        //variables per a que ens digui els dos num aleatoris
        int num_aleatori_a; 
        int num_aleatori_b;
        int si_no; //variable per saber si vol continuar
        int resultat; //variable per a que l'usuari pugui introdïr el resultat
        
        /*Sé que se pueden poner todas las variables en un mismo "int" pero tenerlo 
        así se me hace visualmente mejor para tener las variables ordenadas*/
        
        /*El tipus de bucle utilitzat és un do 
        while perquè s'ha de executar com a mínim una vegada*/
        do {            
            num_aleatori_a = aleatori.nextInt(-num_limit, num_limit);
            System.out.println(num_aleatori_a);
            num_aleatori_b = aleatori.nextInt(-num_limit, num_limit);
            System.out.println(num_aleatori_b);
            System.out.println("Quin és el resultat? ");
            resultat = in.nextInt();
            if (resultat == (num_aleatori_a + num_aleatori_b)){
                System.out.println("Correcte");
                sumes_encertades++;
            }else{
                System.out.println("Incorrecte, el resultat és: " 
                        + (num_aleatori_a + num_aleatori_b));
                sumes_errades++;
            }
            System.out.println("Vols continuar? 1.- SÍ 2.- NO");
            si_no = in.nextInt();
        } while ((si_no == 1) && (sumes_errades < 5));
        System.out.printf("Sumes encertades: %d\nSumes errades: %d\n", 
                sumes_encertades, sumes_errades);
    }
}

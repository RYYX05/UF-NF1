/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursitivitat;

import java.util.Scanner;

/**
 *
 * @author roli1509
 */
public class ej10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cantidad de arañas: ");
        int spider = in.nextInt();
        System.out.println(potes(spider));
    }
    public static int potes(int aranyes){
        if(aranyes == 0){
            return aranyes;
        }else{
            return potes(aranyes - 1) + 8;
        }
    }
}

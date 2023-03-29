package taller_1;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        int peso, meses, dosis;
        System.out.println("cuanto pesa el bebe");
        peso = lectura.nextInt();
        System.out.println("cuantos meses tiene el bebe");
        meses = lectura.nextInt();
        dosis = ((peso + 10) / (meses *10)) * 8;
        System.out.println("la dosis de vacuna necesaria para el bebe es " +dosis);
        lectura.close();
    }
}
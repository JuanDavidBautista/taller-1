package taller_1;

import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        int bolita = (int)(Math. random()*4+1);
        int descuento1, descuento2, descuento3, valor, total1, total2, total3;
        Scanner lectura =new Scanner(System.in);
        System.out.println("ingrese el valor a pagar y deja que la suerte decida tu descuentop");
        valor = lectura.nextInt();
        descuento1 = (valor * 10) / 100;
        total1 = valor - descuento1;
        descuento2 = (valor * 30) / 100;
        total2 = valor - descuento2;
        descuento3 = (valor * 50) / 100;
        total3 = valor - descuento3;
        if(bolita == 1){
            System.out.println("Sacaste la bolita roja, asi que obtienes un 10% de descuento tu valor total de compra es: "+total1);
        }
        else if(bolita == 2 ){
            System.out.println("sacaste la bolita azul, asi que obtienes un 30% de descuento el valor final de tu compra es: "+total2);
        }
        else if(bolita == 3 ){
            System.out.println("sacaste la bolita amarilla, asi que obtienes un 50% de descuento el valor final de tu compra es: "+total3);
        }
        else{
            System.out.println("sacaste la bolita blanca, asi tu compra corre por la casa ¡disfrutala!");
        }
        lectura.close();
    }
}

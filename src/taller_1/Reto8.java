package taller_1;

import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {

        Scanner lectura =new Scanner(System.in);
        int bolita = (int)(Math. random()*3+1);
        int descuento1, descuento2, descuento3, precio, total1, total2, total3, registrar, acumulador, cantidad, valor, pago, cambio1, cambio2, cambio3, cambio4;
        registrar = 1;
        acumulador = 0;

        while(registrar == 1){
            System.out.println("Digite el precio del producto");
            precio = lectura.nextInt();
            System.out.println("Digite la cantidad del producto");
            cantidad = lectura.nextInt();
            System.out.println("¿Desea registrar otro producto? si(1) no(2)");
            registrar = lectura.nextInt();
            valor = precio * cantidad;
            acumulador = acumulador + valor;
        }
        if(acumulador > 50000){
            System.out.println("felicidades, gracias a tu compra podras tener suerte y recibir un gran descuento");
        descuento1 = (acumulador * 10) / 100;
        total1 = acumulador - descuento1;
        descuento2 = (acumulador * 30) / 100;
        total2 = acumulador - descuento2;
        descuento3 = (acumulador * 50) / 100;
        total3 = acumulador - descuento3;
        if(bolita == 1){
          System.out.println("Sacaste la bolita roja, asi que obtienes un 10% de descuento tu valor inicial era "+acumulador+" ycon el descuento te quedo en "+total1);
          System.out.println("Con cuanto desea pagar");
          pago = lectura.nextInt();
          cambio1 = pago - total1;
          System.out.println("su cambio es "+cambio1);
        }
        else if(bolita == 2 ){
          System.out.println("sacaste la bolita azul, asi que obtienes un 30% de descuento tu valor inicial era "+acumulador+" ycon el descuento te quedo en "+total2);
          System.out.println("Con cuanto desea pagar");
          pago = lectura.nextInt();
          cambio2 = pago - total2;
          System.out.println("su cambio es "+cambio2);
        }
        else if(bolita == 3 ){
          System.out.println("sacaste la bolita amarilla, asi que obtienes un 50% de descuento tu valor inicial era "+acumulador+" ycon el descuento te quedo en "+total3);
          System.out.println("Con cuanto desea pagar");
          pago = lectura.nextInt();
          cambio3 = pago - total3;
          System.out.println("su cambio es "+cambio3);
        }
        else{
          System.out.println("sacaste la bolita blanca, asi tu compra corre por la casa ¡disfrutala!");
        }
        }
        else{
            System.out.println("el valor de tu compra es "+acumulador);
            System.out.println("Con cuanto desea pagar");
            pago = lectura.nextInt();
            cambio4 = pago -acumulador;
            System.out.println("su cambio es "+cambio4);
        }
        
        lectura.close();
    }
}

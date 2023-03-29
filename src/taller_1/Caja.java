package taller_1;

import java.util.Scanner;

public class Caja {
    public static void main(String[] args) {
        int precio, cantidad, contador, subtotal, acumulado, pago, cambio, movil;
        Scanner lectura =new Scanner(System.in);
        contador = 0;
        acumulado = 0;
        for( int x=1; x<=5; x++){
          System.out.println("Digite el precio del producto");
          precio = lectura.nextInt();
          System.out.println("Digite la cantidad del producto");
          cantidad = lectura.nextInt();
          contador = contador + 1;
          subtotal = precio * cantidad;
          acumulado = acumulado + subtotal;
        }
        System.out.println("el valor total a pagar es: " +acumulado);
        System.out.println("ingrese el valor con el que va a pagar");
        pago = lectura.nextInt();
        cambio = pago - acumulado;
        System.out.println("su cambio es: " +cambio);
        System.out.println("¿Cuenta con telefonia movil exito? si(1) no(2)");
        movil = lectura.nextInt();
        if (movil == 1){
            System.out.println("Felicidades, en agradecimiento a su compra le obsequiaremos " +contador+ " minutos para su telefonia movil exito");
        }
        else {
            System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil exito");
        }
        lectura.close();
    }
}    


package taller_1;

import java.util.Scanner;

public class Ejemplow {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);

         int budget, spein, seguir, contador, acumulador;
         seguir = 1;
         budget = 100000;
         contador = 0;
         acumulador = 0;

         while(seguir == 1 && contador < 3){
            System.out.println("Ingrese el valor del gasto");
            spein = lectura.nextInt();
            budget = budget - spein;
            System.out.println("gastó un total de "+spein+" el presupuesto que le queda es "+budget);
            System.out.println("Desea registrar otro gasto si(1) no(2)");
            seguir = lectura.nextInt();
            contador = contador + 1;
            acumulador = acumulador + spein;
            if (contador == 3){
                System.out.println("ya no puedes hacer mas registros");
               
            }
        }
        System.out.println("el valor total de sus gastos fue "+acumulador+ " y su presupuesto final quedo en "+budget);
        lectura.close();
    }
    
}

package taller_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        double notas,acumulador,definitiva;
        Scanner lectura =new Scanner(System.in);
        acumulador = 0;
        for( int x=1; x<=4; x++){
            System.out.println("Digite la nota que saco en cada uno de los cuatro talleres");
            notas = lectura.nextDouble();
            if (notas >= 0.0 && notas <= 5.0){
            acumulador = acumulador + notas;
            }
            else {
                System.out.println("el numero ingresado es invalido");
            }      
        }                        
        definitiva = acumulador / 4;
        if (definitiva >= 0.0 && definitiva <= 2.9 ){
            System.out.println("Reprobaste la asignatura");
        }
        else if (definitiva >= 3.0 && definitiva <= 4.0){
            System.out.println("Pasaste raspando la asignatura");
        }
        else {
            System.out.println("Aprobaste con buenos resultados");
        }
        lectura.close();
    }
}


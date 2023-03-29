package taller_1;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        int genero, contadorH, contadorM;
        Scanner lectura =new Scanner(System.in);
        contadorH = 0;
        contadorM = 0;
        for( int x=1; x<=10; x++){
        System.out.println("seleccione su genero hombre(1) mujer(2)");
        genero =  lectura.nextInt();
        if (genero == 1){
            contadorH = contadorH + 1;
        }
        else {
            contadorM = contadorM + 1;
        }
        }
        System.out.println("el numero total de hombres es: "+contadorH+" y el numero total de mujeres es: "+contadorM);
        lectura.close();
    } 
}

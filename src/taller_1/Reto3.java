package taller_1;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        int numero = (int)(Math. random()*2+1);
        int desicion;
        System.out.println("Escoja cara(1) o sello(2)");
        desicion = lectura.nextInt();
        if(numero == 1 && desicion == 1){
            System.out.println("felicidades por escoger cara, ha ganado");
        }
        else if(numero == 2 && desicion == 2){
            System.out.println("felicidades por escoger sello, ha ganado");
        }
        else{
            System.out.println("lamento decirle que no gano");
        }      
        lectura.close();
    }
}
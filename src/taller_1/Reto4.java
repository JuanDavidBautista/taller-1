package taller_1;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        int maquina = (int)(Math. random()*3+1);
        int saque;
        System.out.println("Vamos a jugar piedra, papel o tijeras");
        System.out.println("Escoga piedra(1) papel(2) tijeras(3)");
        saque = lectura.nextInt();
        if(saque == 1 && maquina == 2){
            System.out.println("sacaste piedra y la maquina saco papel asi que pierdes");
        }
        else if(saque == 1 && maquina == 3){
            System.out.println("sacaste piedra y la maquina saco tijeras asi que ganas");
        }
        else if(saque == 2 && maquina == 3){
            System.out.println("sacaste papel y la maquina saco tijeras asi que pierdes");
        }
        else if(saque == 2 && maquina == 1){
            System.out.println("sacaste papel y la maquina saco piedra asi que ganas");
        }
        else if(saque == 3 && maquina == 2){
            System.out.println("sacaste tijeras y la maquina saco papel asi que ganas");
        }
        else if(saque == 3 && maquina == 1){
            System.out.println("sacaste tijeras y la maquina saco piedra asi que pierdes");
        }
        else{
            System.out.println("ambos sacaron lo mismo asi que es un empate");
        }
        lectura.close();
    }
}

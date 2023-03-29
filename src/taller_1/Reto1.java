package taller_1;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        int centigrados;
        centigrados = (380 - 32) / 18;
        System.out.println("la abuela necesita poner el horno a "+centigrados+" grados centigrados");
        lectura.close();
    }
}

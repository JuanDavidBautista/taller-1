package taller_1;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        String nombre, apellido, nombrecompleto, union;
        System.out.println("ingrese su nombre");
        nombre = lectura.nextLine();
        System.out.println("igrese su apellido");
        apellido = lectura.nextLine();
        System.out.println("la longitud de el nombre es " +nombre.length()+ " y la de el apellido es "+apellido.length());
        System.out.println("El nombre en mayusculas: " +nombre.toUpperCase()+ " El apellido en minusculas: " +apellido.toLowerCase());
        nombrecompleto = nombre + apellido;
        System.out.println("el nombre completo es: "+nombrecompleto);
        union = nombre.substring(0,2) + apellido;
        System.out.println("la combiacion de las dos primeras letras del nombre y el apellido es: " +union); 
        lectura.close();
    }
}
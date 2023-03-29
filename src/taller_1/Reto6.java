package taller_1;

import java.util.Scanner;

public class Reto6 {
       public static void main(String[] args){
              Scanner lectura =new Scanner(System.in);
              int dado1 = (int)(Math.random()*6+1);
              int dado2 = (int)(Math.random()*6+1);
              int lanzamiento;
              System.out.println("presione 1 para lanzar los dados");
              lanzamiento = lectura.nextInt();
              if(lanzamiento== 1 && dado1 == 1 && dado2 == 1){
                System.out.println("Felicidades por sacar un par de unos, ¡ganaste!");
              }
              else  if(lanzamiento== 1 && dado1 == 1 && dado2 == 2  && dado1 == 2  && dado2 == 1){
                System.out.println("Felicidades por sacar un total de 3, ¡ganaste!");
              }
              else  if(lanzamiento== 1 && dado1 == 5 && dado2 == 6 && dado1 == 6 && dado2 == 5){
                System.out.println("Felicidades por sacar un total de 11, ¡ganaste!");
              }
              else  if(lanzamiento== 1 && dado1 == 6 && dado2 == 6){
                System.out.println("Felicidades por sacar 12, ¡ganaste!");
              }
              else  if(lanzamiento== 1 && dado1 == 5 && dado2 == 2 && dado1 == 2 && dado2 == 5 && dado1 == 4 && dado2 == 3 && dado1 == 3 && dado2 == 4){
                System.out.println("Felicidades por sacar un total de 7, ¡ganaste!");
              }else{
                System.out.println("mal lanzamiento, ¡perdiste!");
              }
              lectura.close();
       }
} 

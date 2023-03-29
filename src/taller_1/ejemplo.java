package taller_1;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args){
        Scanner lectura =new Scanner(System.in);
        System.out.println("ingrese un numero");
        int number1, number2, op, total, menos, multi, divi;
        number1=lectura.nextInt();
        System.out.println("ingrese otro numero");
        number2=lectura.nextInt();
        System.out.println("seleccione la operacion que desea realizar: 1.suma 2.resta 3.multiplicacion 4.division 5.ponteciacion 6.radicacion");
        op=lectura.nextInt();
        switch(op){
            case 1:
            total = number1 + number2;
            System.out.println("la suma entre "+number1+" y "+number2+ " es "+total);
            break;
            case 2:
            menos = number1 - number2;
            System.out.println("la resta entre "+number1+" y "+number2+ " es "+menos);
            break;
            case 3:
            multi = number1 * number2;
            System.out.println("la multiplicacion entre "+number1+" y "+number2+ " es "+multi);
            break;
            case 4:
            divi = number1 / number2;
            System.out.println("la division entre "+number1+" y "+number2+ " es "+divi);
            break;
            case 5:
            Double poten = Math.pow(number1,number2);
            System.out.println("el resultado de elevar "+number1+" a la "+number2+ " es "+poten);
            break;
            case 6:
            Double raiz1 = Math.sqrt(number1);
            Double raiz2 = Math.sqrt(number2);
            System.out.println("la raiz cuadrada de "+number1+" es "+raiz1);
            System.out.println("la raiz cuadrada de "+number2+" es "+raiz2);
            break;
            default:
            System.out.println("la opcion seleccionada no es valida");
            break;
        }
        lectura.close();
    }
}
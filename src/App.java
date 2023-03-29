import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura =new Scanner(System.in);
        System.out.println("imgrese un numero");
        int numberOne;
        numberOne=lectura.nextInt();
        System.out.println("ingrese un segundo numero");
        int numberTow;
        numberTow=lectura.nextInt();
        System.out.println("los numeros ingresados son "  +numberOne+ " y " +numberTow+ ", y su suma es " +(numberOne + numberTow));
        lectura.nextLine(); //limpieza buffer
        System.out.println("ingresa tu nombre");
        String name;
        name=lectura.nextLine();
        System.out.println("su nombre es "  +name);
        lectura.close();     
    }
}

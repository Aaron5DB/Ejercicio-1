
package com.mycompany.ejercicio_1;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        System.out.println("¿Cuantos segundos pasaran desde del evento dado?");
        int seg = lee.nextInt();
        if (seg > 0) {
            int s = (seg % 3600) % 60;
            int m = (seg % 3600) / 60;
            int h = (seg / 3600);
            System.out.println("El tiempo transcurrido fue: "+ h +": " + m +": " + s);
        }else
            System.out.println("El numero ingresado no es entero.");    
    }
}

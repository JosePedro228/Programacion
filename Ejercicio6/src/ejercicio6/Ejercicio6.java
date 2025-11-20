/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DAM113
 */
public class Ejercicio6 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cual tarea?");
        int tarea = sc.nextInt();
        switch (tarea) {
            case 1:
                Tarea1();
                break;
            case 2:
                Tarea2();
                break;
            case 3:
                Tarea3();
                break;
           /* case 4:
                Tarea4();
                break;
            case 5:
                Tarea5();
                break;
            case 6:
                Tarea6();
                break;
            case 7:
                Tarea7();
                break;*/
            default:
                System.out.println("NO TIENE ESTA TAREA RENICIA EL PROGRAMA");
        }
    }

    public static void Tarea1() {
        System.out.println("Ponga un numero");
        int num = sc.nextInt();
        if (num != 0) {
            for (int i = num; i >= 1; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void Tarea2() {
        System.out.println("Ponga un numero");
        int num1 = sc.nextInt();
        System.out.println("Ponga un numero");
        int num2 = sc.nextInt();
        int suma = 0;
        if (num1 > num2) {
            for (int i = num2 + 1; i < num1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    suma += i;

                }
            }
        } else {
            for (int i = num1 + 1; i < num2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    suma += i;

                }
            }
        }

        System.out.println(suma);
    }

    public static void Tarea3() {
        System.out.println("Ponga un numero");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i*num);
        }
    }
}

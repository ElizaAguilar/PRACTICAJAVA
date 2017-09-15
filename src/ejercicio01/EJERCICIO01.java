/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJERCICIO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejerc1 = new Scanner(System.in);
        // Estoy pidiendo al usuario que ingrese una variable numero, en la segunda linea las veces que el usuario desee multiplicar,
        // Es hacer un bucle con el número y las veces que quieras multiplicar.
        
        System.out.println("INGRESAR EL PRIMER NUMERO A MULTIRPLICAR:"); 
        double number1= ejerc1.nextDouble();
        System.out.println("INGRESAR LAS VECES QUE QUIERE MULTPLICAR EL NUMERO:");
        double number2 = ejerc1.nextDouble();
        double number3= 0;
         
         for (int i = 1; i < number2 + 1 ; i++)
         {
             number3+= number1;
         }
         System.out.println("LA RESPUESTA DE LOS DOS NUMEROS MULTIPLICADOS ES :" + number3);
         
         }
    
}

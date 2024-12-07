/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._examen;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class App {
    
    public static int alumno1;
    public static int alumno2;
    public static int alumno3;
    public static int alumno4;
    public static int alumno5;

    public static void main(String[] args) {
     

    Scanner scani = new Scanner(System.in);
        System.out.println("Ingresar numero  de alumnos");
        
    System.out.println("Calificacion del Alumno1: ");
        alumno1=scani.nextInt();
        
    
     System.out.println("Calificacion del Alumno2: ");
        alumno2=scani.nextInt();
        

     System.out.println("Calificacion del Alumno3: ");
        alumno3=scani.nextInt();
        
        System.out.println("Calificacion del Alumno4: ");
        alumno4=scani.nextInt();
        

        System.out.println("Calificacion del Alumno5: ");
        alumno5=scani.nextInt();
     
    
    } 
    
   public static void calcularPromedio(double alumnos){
     switch(alumno3){
         case 1:
             for (int i = alumno1; i < alumno2; i++) {
                 System.out.println("Promediao"+i);
             }
     break;
     }
     
         
     
   } 
  }

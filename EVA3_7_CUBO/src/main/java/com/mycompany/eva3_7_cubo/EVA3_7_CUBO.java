/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_cubo;

/**
 *
 * @author alexis
 */
public class EVA3_7_CUBO {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo = new int[2][5][3];//30 enteros
        //LENARLO CON VALORES ALEATORIOS
        System.out.println(cubo.length);
        System.out.println(cubo[0].length);
        System.out.println(cubo[0][0].length);
        
         for(int i = 0; i < cubo.length; i++){
             for(int j = 0; j < cubo[i].length; j++){
                 for(int k = 0; k < cubo[i][j].length; k++){
                     cubo[i][j][k] = (int)(Math.random() * 100);
                 }
             }
         } 
        //imprimir
        for(int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo[i].length; j++){
                for(int k = 0; k < cubo[i][j].length; k++){
                    System.out.print("[" + cubo[i][j][k] + "]");
                }
            }
        }
    }
    
}
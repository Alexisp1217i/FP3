/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_for_each;

/**
 *
 * @author alexis
 */
public class EVA3_8_FOR_EACH {

  public static void main(String[] args) {
        // TODO code application logic here
        String[] dias = {"Lunes", "Martes", "Miercoles", "Juevez", "Viernes", "Sabado", "Domingo"};
        
        /*for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
        }*/
        for(String cade: dias){
            System.out.println(cade);
        }
        
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        for(int billete: billetes){
            System.out.println(billete);
        }
    }
    
}
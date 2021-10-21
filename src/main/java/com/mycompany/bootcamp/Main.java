/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamp;

/**
 *
 * @author leeseona25
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 31; i++) {
            
            if (i % 7 == 0) {
                System.out.println("Tanggal-" + i + " Libur");
            }else{
                System.out.println("Tanggal-" + i +" Masuk");
            }
        }
        
    }
    
}

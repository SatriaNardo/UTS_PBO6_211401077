/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_pbo_no2;

import java.util.Scanner;

/**
 *
 * @author REPUBLIC OF GAMERS
 */
public class UTS_PBO_NO2 {
//Untuk rekurisif akan kita lakukan program faktorial
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Silakan Masukkan Angka yang ingin Difaktorialkan");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = faktorial(n);
        System.out.println("Hasil Faktorial dari " + n + " adalah " + result);
    }

public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n-1);
        }
}
        

        
}

    


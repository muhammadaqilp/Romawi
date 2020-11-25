/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romawi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Romawi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int a;
       
        System.out.println("KONVERTER BILANGAN ROMAWI");
        System.out.println("Masukkan Angka Yang Ingin Anda Konversikan : ");
        a=scan.nextInt();
        
        System.out.println("Angka "+a+" dikonversikan ke romawi adalah ");
                if(a<1||a>3000){
                    System.out.println("Eror");
                }
                else{
                    while(a>=1000){
                        System.out.print("M");
                        a-=1000;
                    }
                    if(a>=500){
                        if(a>=9000){
                            System.out.print("CM");
                            a-=900;
                        }
                        else{
                            System.out.print("D");
                            a-=500;
                        }
                    }
                }
                    while(a>=100){
                        if(a>=400){
                            System.out.print("CD");
                            a-=400;
                        }
                        else{
                            System.out.print("C");
                            a-=100;
                        }
                    }
                    if(a>=50){
                        if(a>=90){
                            System.out.print("XC");
                            a-=90;
                        }
                        else{
                            System.out.print("L");
                            a-=50;
                        }
                    }
                    while(a>=10){
                        if(a>=40){
                            System.out.print("XL");
                            a-=40;
                        }
                        else{
                            System.out.print("X");
                            a-=10;
                        }
                    }
                    if(a>=5){
                        if(a==9){
                            System.out.print("IX");
                            a-=9;
                        }
                        else{
                            System.out.print("V");
                            a-=5;
                        }
                    }
                    while(a>=1){
                        if(a==4){
                            System.out.print("IV");
                        }
                        else{
                            System.out.print("I");
                            a-=1;
                        }
                    }
                    System.out.println();
     
    }
}

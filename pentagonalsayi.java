
package javaapp;

import java.util.Scanner;
public class pentagonalsayi {
     public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        System.out.println("20 de buyuk bir sayi giriniz :");
        int sayi=sc.nextInt();
        int n=0;
       
        for(int i=1;i<=sayi;i++){
        
            n=i*(((3*i)-1)/2);
            System.out.println(n);
        }
        
         
     }
    
}

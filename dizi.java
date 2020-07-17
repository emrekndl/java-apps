
package javaapp;

import java.util.Scanner;
public class dizi {
   public static void main(String[] args){
   
       Scanner k = new Scanner(System.in);
       System.out.println("İlk kelimeyi giriniz :");
       String k1=k.nextLine();
        System.out.println("İkinci kelimeyi giriniz :");
       String k2=k.nextLine();
       if(k1.equalsIgnoreCase(k2))
        System.out.println("Girilen kelimeler birbirine eşit(büyük-küçük harf ayrımı yok) -> "+k1+"="+k2);
       
       
       /*
       if(k1.equals(k2))
        System.out.println("Girilen kelimeler birbirine eşit(büyk-küçük harf ayrımı var) -> "+k1+"="+k2);
       */
       
       
   } 
}

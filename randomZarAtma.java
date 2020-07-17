
package javaapp;

import java.util.Scanner;
import java.util.Random;
public class Javaapp {

    
    public static void main(String[] args) {
       Random r=new Random();
       Scanner k=new Scanner(System.in);
       System.out.println("Kaç kere zar atmak istersiniz :");
       int sayi=k.nextInt();
       System.out.println("1. tur rastgele atılıyor: ");
       for(int i=0;i<sayi;i++){
       System.out.println(r.nextInt(6));
       }
       
       
     
      
      }
     
}

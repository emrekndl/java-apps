
package javaapp;
import java.util.Scanner;
public class sayitersi {
     public static void main(String [] args){
     
        
         ters();
     }
    static void ters(){
    
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Bir sayi giriniz :");
         int sayi=sc.nextInt();
         int bolum = 0,kalan;
         while(sayi!=0){
         kalan=sayi%10;
         bolum=bolum*10+kalan;
         sayi/=10;
         }
        System.out.println("Sayinin tersi :"+bolum);
    }
    
}

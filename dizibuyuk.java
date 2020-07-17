
package javaweek4;

import java.util.Scanner;


public class dizibuyuk {
    public static void main(String ags[]){
    
        int []yenidizi=diziAl();
    }
     public static int[] diziAl(){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz :");
        int sayi =sc.nextInt();
        int [] dizi = new int[sayi];
        for(int i=0;i<sayi;i++){
            System.out.println("Dizinin "+i+1+". elemanını giriniz :");
            dizi[i]=sc.nextInt();
            
        }
        return dizi;
        
    }
    /* static int enbuyuk(int []dizi){
     int en=0;
     for(int i=0;i<dizi.length;i++)
     
         return en;
     }*/
     
     
}

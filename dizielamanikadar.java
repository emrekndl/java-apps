
package javaweek4;

import java.util.Scanner;


public class dizielamanikadar {
    public static void main(String args[]){
    
        int dizi[]=diziAl();
        
        yazdir(dizi.length,dizi);
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
     static void yazdir(int boyut,int dizi[]){
         
         for(int i=0;i<boyut;i++){
         /*
             for(int j=0;j<dizi[i];j++;){
         
             System.out.println();
          }*/
         }
         
    }
}

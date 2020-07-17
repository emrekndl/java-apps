
package javaweek4;

import java.util.Scanner;


public class dizitekcift {
    public static void main(String args[]){
    
        int dizi[]=diziAl();
        int t=0,c=0;
        int yeni[]=new int[dizi.length];
        for(int i=0;i<dizi.length;i++){
        
            if(dizi[i]%2!=0){
              t=dizi[i];
              yeni[c]=t;
              c++;
            }
        }
        for(int i=0;i<yeni.length;i++){
        
            System.out.println(yeni[i]);
        }
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
}


package javaweek4;
import java.util.Scanner;

public class diziolusturma {
    public static void main(String args[]){
    int []a=diziAl();
        
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
    static void ekranaYazdir(int dizi[]){
    for(int i=0;i<dizi.length;i++){
        if(i!=dizi.length-1)
            System.out.println(dizi[i]+", ");
        else
            System.out.println(dizi[i]);
    }
        
    }
}

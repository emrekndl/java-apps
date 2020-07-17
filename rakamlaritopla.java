
package javaapp;
import java.util.Scanner;
public class rakamlaritopla {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
       int  sayi=sc.nextInt();
        int a=0,kalan;
       while(sayi!=0){
       kalan=sayi%10;
       a+=kalan;
       sayi/=10;
       }
        System.out.println(a);
    }
}

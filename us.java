
package javaapp;

import java.util.Scanner;
public class us {
    public static void main(String[] args){
    
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Sayiyi girinizi :");
        int sayi=sc.nextInt();
        System.out.println("Sayinin ussunu girinizi :");
        int us=sc.nextInt();
        int a=1;
        for(;us>0;us--){
        
            a*=sayi;
        }
        System.out.println(a);
    }
    
}

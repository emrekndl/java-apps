package javaapp;

import java.util.Scanner;
public class palindrom {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
       int  sayi=sc.nextInt();
       int s=sayi;
       int a=0,kalan;
       while(sayi!=0){
       kalan=sayi%10;
       a=a*10+kalan;
       sayi/=10;
       }
       if(s==a)
           System.out.println(s+" sayisi polindrom");
        else
            System.out.println(s+" sayisi polindrom degildir");
        
    }
    
}

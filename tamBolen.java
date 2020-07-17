
package javaapp;

import java.util.Scanner;
import java.io.Console;
public class tamBolen {
    public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.println("Bir sayı giriniz :");
    int s=k.nextInt();
    for(int i=1;i<=s;i++){
    
        if(s%i==0)
            System.out.println(s+" sayısının tam bölenleri :"+i);
    }
        
    }
}

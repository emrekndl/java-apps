
package javaapp;

import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
    
        Scanner k=new Scanner(System.in);
        int sayi;
        do{
            System.out.println("Bir sayı girinz :");
            sayi=k.nextInt();
        }while(sayi!=10);
 }
}

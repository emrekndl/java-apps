
package javaapp;

import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args){
    alan();
    }
 
  static void alan(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Ucgenin kenarini giriniz :");
      int k1=sc.nextInt();
      System.out.println("Ucgenin kenarini giriniz :");
      int k2=sc.nextInt();
      System.out.println("Ucgenin kenarini giriniz :");
      int k3=sc.nextInt();
      int s=(k1+k2+k3)/2;
      int alan=(s*(s-k1)*(s-k2)*(s-k3));
      System.out.println(Math.sqrt(alan));

}
   
}

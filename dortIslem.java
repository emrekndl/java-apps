
package javaapp;

import java.util.Scanner;
public class dortIslem {
  public static void main(String[] args){
  
      Scanner k = new Scanner(System.in);
      System.out.println("Birinci sayıyı giriniz :");
      int s1=k.nextInt();
      System.out.println("Birinci sayıyı giriniz :");
      int s2=k.nextInt();
      System.out.println("Bir işlem seçiniz :\nToplama --> 1\nÇıkarma --> 2\nÇarpma --> 3\nBölme --> 4");
      int secim=k.nextInt();
      switch(secim){
          case 1:System.out.println(s1+"+"+s2+"="+(s1+s2));break;
          case 2:System.out.println(s1+"-"+s2+"="+(s1-s2));break;
          case 3:System.out.println(s1+"x"+s2+"="+(s1*s2));break;
          case 4:System.out.println(s1+"/"+s2+"="+(double)((double)s1/(double)s2));break;
          default:System.out.println("Yanlış aralıkta değer girdiniz!");break;    
      }
      
  }
}

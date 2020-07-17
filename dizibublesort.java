
package javaweek4;

import java.util.Scanner;


public class dizibublesort {
    public static void main(String args []){
    
        int [] dizi=diziAl();
        
        System.out.println("Karisik dizi : "); 
        
         for(int i=0;i<dizi.length;i++){
        
            System.out.println(dizi[i]);
        }
        
        bubbleSort(dizi);
    }
    
     public static int[] diziAl(){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz :");
        int sayi =sc.nextInt();
        int [] dizi = new int[sayi];
        
        for(int i=0;i<sayi;i++){
            System.out.println("Dizinin "+(i+1)+". elemanını giriniz :");
            dizi[i]=sc.nextInt();
            
        }
        return dizi;
        
    }
     
      public static void bubbleSort(int[] arr) {
        boolean takas = true;
        int j = 0;
        int yedek;
       while (takas) {
       takas = false;
       j++;
      for (int i = 0; i < arr.length - j; i++)
     {
       if (arr[i] > arr[i + 1]) {
          yedek = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = yedek;
          takas = true;
         }
     }
   }
        System.out.println("BubbleSort ile siralanmis dizi : "); 
        for(int i=0;i<arr.length;i++){
        
            System.out.println(arr[i]);
        }
       
 }
     
}

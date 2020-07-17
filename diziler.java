
package javaweek4;


public class diziler {
    public static void main(String args[]){
    
     int [] dizi={4,8,3,1,18,9,21,20,5,17};
     int toplam=0;
     for(int i=0;i<dizi.length;i++){
     
         toplam+=dizi[i];
     }
     System.out.println("Toplam :"+toplam);
     System.out.println("Ortalama :"+(double)toplam/(double)dizi.length);
    }
    
}




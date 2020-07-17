import java.util.*;

class data{
	int deger;
	boolean bayrak;
}
 
public class JavaThread{
	public static void main(String args[]){
		data d = new data();
		d.deger = 0;
		d.bayrak = false;		

		
		consumer c = new consumer(d);
		Thread t = new Thread(c); //consumer thread olmadığından c thread e alındı
		
		t.start();
		producer p = new producer(d);
		p.start();
	}
}

class producer extends Thread{ //üretici
	data d;
	public producer(data d){
		this.d = d;
	}
	public void run(){
		for(int i=0;i<10;i++){
			try{
    	 			sleep(1000);
    			}catch(InterruptedException e){
         			e.printStackTrace();
    			}
			synchronized(d){ // senkronize işlemi(çalışırken araya kimse giremez)
				if(d.bayrak == false){
					d.deger++;
					System.out.println("Uretici :"+d.deger);
		                        d.bayrak = true;
				}
			}
		}
	}
}

class consumer implements Runnable{ //Tüketici
	data d;
	public consumer(data d){
		this.d = d;
	}
	public void run(){
		for(int i=0;i<10;i++){
			try{
    		 		Thread.sleep(1000);
   	 		}catch(InterruptedException e){
        	 		e.printStackTrace();
    			}
			synchronized(d){
				if(d.bayrak == true){
					d.deger--;
					System.out.println("Tuketici :"+d.deger);
					d.bayrak = false;
				}
			}
		}
	}
}



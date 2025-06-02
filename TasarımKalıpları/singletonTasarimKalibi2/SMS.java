
package singletondesignpattern;


public class SMS{
	
	private static volatile SMS baglanti;
	public int bky = 100;
	private SMS() {
		System.out.println("Bağlantı sağlandı. ");
	}
	public static SMS getBaglanti() {
		if(baglanti == null) {
			synchronized(SMS.class) {
				if(baglanti == null)
					baglanti = new SMS();
			}
		}else {
			System.out.println("Baglanti zaten var!");
		}
		return baglanti;
	}
	
	public void gonder(String text, int no) {
		System.out.println("No:"+no +"-> Mesaj :"+text);
		this.bky -= 5;
	}
	
	public int bakiye() {
		return this.bky;
	}
	
}
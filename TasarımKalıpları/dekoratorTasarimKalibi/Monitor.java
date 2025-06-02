
public class Monitor extends KompenentDekorator{
	Bilgisayar bilgisayar;
	
	public Monitor(Bilgisayar b) {
		this.bilgisayar = b;
	}
	
	public String ozellik() {
		return bilgisayar.ozellik() + " - Monitor ";
	}
	
	public int hesaplaFiyat() {
		return bilgisayar.hesaplaFiyat() + 200;
	}
}

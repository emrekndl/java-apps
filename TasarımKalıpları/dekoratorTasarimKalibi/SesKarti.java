
public class SesKarti extends KompenentDekorator{
	Bilgisayar bilgisayar;
	
	public SesKarti(Bilgisayar b) {
		this.bilgisayar = b;
	}
	
	public String ozellik() {
		return bilgisayar.ozellik() + " - Ses Kartı ";
	}
	
	public int hesaplaFiyat() {
		return bilgisayar.hesaplaFiyat() + 75;
	}
}

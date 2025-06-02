
public class EkranKarti extends KompenentDekorator{
	Bilgisayar bilgisayar;
	
	public EkranKarti(Bilgisayar b) {
		this.bilgisayar = b;
	}
	
	public String ozellik() {
		return bilgisayar.ozellik() + " - Ekran Kartı ";
	}
	
	public int hesaplaFiyat() {
		return bilgisayar.hesaplaFiyat() + 1000;
	}
}

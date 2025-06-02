
public class DVDRom extends KompenentDekorator{
	Bilgisayar bilgisayar;
	
	public DVDRom(Bilgisayar b) {
		this.bilgisayar = b;
	}
	
	public String ozellik() {
		return bilgisayar.ozellik() + " - DVDRom ";
	}
	
	public int hesaplaFiyat() {
		return bilgisayar.hesaplaFiyat() + 100;
	}
}

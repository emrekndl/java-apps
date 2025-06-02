
public class HardDisk extends KompenentDekorator {
	Bilgisayar bilgisayar;
	
	public HardDisk(Bilgisayar b) {
		this.bilgisayar = b;
	}
	
	public String ozellik() {
		return bilgisayar.ozellik() + " - HardDisk ";
	}
	
	public int hesaplaFiyat() {
		return bilgisayar.hesaplaFiyat() + 150;
	}
}

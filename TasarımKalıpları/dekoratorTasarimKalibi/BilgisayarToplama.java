
public class BilgisayarToplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilgisayar pc = new Bilgisayar();
		Bilgisayar ortaPc = new Bilgisayar();
		Bilgisayar ileriPc = new Bilgisayar();
		
		pc = new HardDisk(pc);
		System.out.printf("Pc :Konfigrasyon Fiyatı :%d, Özellikler {%s}\n",
				pc.hesaplaFiyat(), pc.ozellik());
		
		ortaPc = new HardDisk(ortaPc);
		ortaPc = new Monitor(ortaPc);
		System.out.printf("Pc :Konfigrasyon Fiyatı :%d, Özellikler {%s}\n",
				ortaPc.hesaplaFiyat(), ortaPc.ozellik());
		
		ileriPc = new HardDisk(ileriPc);
		ileriPc = new Monitor(ileriPc);
		ileriPc = new DVDRom(ileriPc);
		ileriPc = new SesKarti(ileriPc);
		ileriPc = new EkranKarti(ileriPc);
		System.out.printf("Pc :Konfigrasyon Fiyatı :%d, Özellikler {%s}\n",
				ileriPc.hesaplaFiyat(), ileriPc.ozellik());
		

	}

}

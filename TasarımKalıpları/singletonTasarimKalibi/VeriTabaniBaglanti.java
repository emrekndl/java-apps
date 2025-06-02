public class VeriTabaniBaglanti{
	
	/* ## Volatile
	 * Sadece değişkenlere uygulanır.
	 * Çoklu süreçli(process) işlemlerde tercih edilir.
	 * Değişkenin senkronize edilmiş çoklu işleme adandığını ve 
	 * derleyicinin değişkeni optimize etmek için uğraşmamasını belirtir. */ 
	private static volatile VeriTabaniBaglanti birKezYaratma; 
	
	private VeriTabaniBaglanti(){
		System.out.println("Veritabanı bağlantısı sağlandı.");
	}
	
	public static  VeriTabaniBaglanti getBaglantiNesne() {
		
		if(birKezYaratma == null) {
			synchronized(VeriTabaniBaglanti.class) {
				if(birKezYaratma == null) {
					birKezYaratma = new VeriTabaniBaglanti();
				}
				
			}
			
		}
		else {
			System.out.println("Bağlantı zaten var.Kullanabilirsin.");
		}
		
		return birKezYaratma;
	}
}

/*
public class VeriTabaniBaglanti{
	
	private static VeriTabaniBaglanti birKezYaratma;
	
	private VeriTabaniBaglanti(){
		System.out.println("Veritabanı bağlantısı sağlandı.");
	}
	
	public static VeriTabaniBaglanti getBaglantiNesne() {
		
		if(birKezYaratma == null) {
			birKezYaratma = new VeriTabaniBaglanti();
		}
		
		return birKezYaratma;
	}
}
 */
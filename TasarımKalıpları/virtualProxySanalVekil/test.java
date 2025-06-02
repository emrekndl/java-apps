
public class test {

	public static void main(String[] args) {
		
		final image IMAGE1 = new proxyImage("HiResolution_Dog Photo");
		final image IMAGE2 = new proxyImage("HiResolution_Lion Photo");

		System.out.println("IMAGE1["+IMAGE1+"] ilk kez displayImage fonksiyonunu çağırıyor :");
		IMAGE1.displayImage(); // gerekli yükleme
		
		System.out.println("IMAGE1["+IMAGE1+"] ikinci kez displayImage fonksiyonunu çağırıyor :");
		IMAGE1.displayImage(); // gereksiz yükleme
		
		System.out.println("IMAGE1["+IMAGE1+"] üçüncü kez displayImage fonksiyonunu çağırıyor :");
		IMAGE1.displayImage(); // gereksiz yükleme
						
		System.out.println("###############################################################\n");

		System.out.println("IMAGE2["+IMAGE2+"] ilk kez displayImage fonksiyonunu çağırıyor :");
		IMAGE2.displayImage(); // gerekli yükleme
		
		System.out.println("IMAGE2["+IMAGE2+"] ikinci kez displayImage fonksiyonunu çağırıyor :");
		IMAGE2.displayImage(); // gereksiz yükleme

	}

}

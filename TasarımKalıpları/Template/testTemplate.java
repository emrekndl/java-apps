
public class testTemplate {

	public static void main(String[] args) {
		System.out.println("Bir ağaç ev nesnesi oluştur.\n");
		houseTemplate houseType = new woodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************************************************************");

		System.out.println("Bir cam ev nesnesi oluştur.\n");
		houseType = new glassHouse();

		houseType.buildHouse();

	}

}

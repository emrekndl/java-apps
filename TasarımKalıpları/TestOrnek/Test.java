
interface bluetooth {
	public void telefon ();
}

interface wifi {
	public void telefon ();
}

interface kamera {
	public void telefon ();
}

class Telefon implements bluetooth, wifi, kamera {
	String name;
	
	public void telefon () {
		System.out.println(this.name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class Test {

	public static void main(String[] args) {
		Telefon blueTel = new Telefon();
		blueTel.setName("BlueTel");
		blueTel.telefon();
		
	}

}

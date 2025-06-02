
public class Facade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube  = new Cube(10,0,0,0);
		
		cube.render();
		
		cube.rotateAlongZ(30);
		
		cube.render();

	}

}

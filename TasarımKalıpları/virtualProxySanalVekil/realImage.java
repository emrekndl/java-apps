
public class realImage implements image {
	
	private String filename = null;
	
	public realImage(final String filename) {
		
		this.filename = filename;
		loadImageFromDisk();
		
	}
	
	private void loadImageFromDisk(){
		
		System.out.println("   Loading   " + filename);
	}
	
	public void displayImage() {
		
		System.out.println(" Displaying " + filename + "\n");
	}
}

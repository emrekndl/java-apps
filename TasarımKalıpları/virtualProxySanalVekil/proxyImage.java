
public class proxyImage implements image {
	
	private realImage image1 = null;
	private String filename = null;
	
	public proxyImage(String filename) {
		
		this.filename = filename;
		
	}
	
	public void displayImage() {
		
		if(image1 == null) {
			image1 = new realImage(filename);
		}
		
		image1.displayImage();
	}
}

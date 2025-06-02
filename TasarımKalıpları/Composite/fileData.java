
public class fileData implements iData  {
	
private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void doubleClick() {
		System.out.println("Harici uygulamada açılan dosya");
}
}

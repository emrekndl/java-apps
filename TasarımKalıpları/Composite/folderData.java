import java.util.ArrayList;
import java.util.List;

public class folderData implements iData {
	
	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	private List<iData> data_list = new ArrayList<iData>();
	
	@Override
	public void doubleClick() {
		System.out.println("Harici uygulamada açılan dosya");
	}
	
	//NOTE: only folder's have add/remove (in this case)
	public void add(iData fdata){
		this.data_list.add(fdata);
	}
	
	public void remove(iData fdata){
		this.data_list.remove(fdata);
}
}

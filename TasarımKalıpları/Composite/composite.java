
public class composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		folderData folder1 = new folderData(); folder1.setName("Folder 1");
		folderData folder2 = new folderData(); folder2.setName("Folder 2");
		folderData folder3 = new folderData(); folder3.setName("Folder 3");

		fileData file1 = new fileData(); file1.setName("File 1");
		fileData file2 = new fileData(); file2.setName("File 2");
		fileData file3 = new fileData(); file3.setName("File 3");
		fileData file4 = new fileData(); file4.setName("File 4");

        folder1.add(file1);
        folder2.add(file2);

        folder3.add(folder2);
        folder3.add(file3);
        folder3.add(file4);

        folder1.doubleClick();
        folder2.doubleClick();
        folder3.doubleClick();

	}

}

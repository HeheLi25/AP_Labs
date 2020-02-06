package week4;

import java.util.ArrayList;

//Composite
public class Directory implements Component{
	private String name;
	private ArrayList<Component> fileList;
	public Directory(String name) {
		this.name = name;
		fileList = new ArrayList<Component>();
	}
	public void addFile(Component newFile) {
		fileList.add(newFile);
	}

	
	public int getFileNum() {
		int num = fileList.size();
		for(Component c : fileList) {
			num = num + c.getFileNum();
		}
		return num;
	}
	
	public int getFileSize() {
		int size = 0;
		for(Component c : fileList) {
			size = size + c.getFileSize();
		}
		return size;
	}
	
	public void display(int n) {
		for(int i=n;i>0;i--)System.out.print("    ");
		System.out.println(name +"("+getFileSize()+")");
		for(Component c : fileList) {
			c.display(n+1);
		}
		
	}
	

}

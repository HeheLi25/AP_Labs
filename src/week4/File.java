package week4;

//Leaf
public class File implements Component{
	private int size;
	private String name;
	public File(String name, int size) {
		this.size = size;
		this.name = name;
	}
	public int getFileSize() {
		return size;
	}
	public int getFileNum() {
		return 1;
	}
	public void display(int n) {
		for(int i=n;i>0;i--)System.out.print("    ");
		System.out.println(name + "("+getFileSize()+")");
	}

	

}

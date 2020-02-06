package week4;

public class Test {
	
	public static void main(String[] args) {
		File f1 = new File("Beethoven, Symphony no 6",421);
		File f2 = new File("Kind of Blue",201);
		File f3 = new File("Giant Steps",134);
		File f4 = new File("portrait",120);
		File f5 = new File("Settings",10);
		Directory d1 = new Directory("CLASSICAL");
		Directory d2 = new Directory("JAZZ");
		Directory d3 = new Directory("MUSIC");
		Directory d4 = new Directory("PICTURES");
		Directory root = new Directory("ROOT");
		
		d1.addFile(f1);
		d2.addFile(f2);
		d2.addFile(f3);
		d3.addFile(d2);
		d3.addFile(d1);
		d4.addFile(f4);
		root.addFile(f5);
		root.addFile(d4);
		root.addFile(d3);
		
		System.out.println("Total file num:"+root.getFileNum());
		System.out.println("Total file size:"+root.getFileSize());
		root.display(0);
		
	}
}

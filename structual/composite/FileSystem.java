package structual.composite;

//Client code
public class FileSystem {
	public void runComposite() {
		FileSystemComponent file1 = new File("File1", 500);
		FileSystemComponent file2 = new File("File2", 1000);
		FileSystemComponent dir1 = new Directory("Directory1");

		dir1.add(file1);
		dir1.add(file2);

		FileSystemComponent file3 = new File("File3", 1500);
		FileSystemComponent dir2 = new Directory("Directory2");

		dir2.add(file3);
		dir2.add(dir1);

		System.out.println("The size of the file system is " + dir2.getSize());
		System.out.println("The contents of the file system are:");
		System.out.println(dir2.toString(0));
	}
}

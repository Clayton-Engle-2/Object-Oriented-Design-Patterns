package structual.composite;

import java.util.ArrayList;
import java.util.List;

//Leaf
public class File extends FileSystemComponent {
	private long size;

	public File(String name, long size) {
		super(name);
		this.size = size;
	}

	@Override
	public void add(FileSystemComponent component) {
	}

	@Override
	public void remove(FileSystemComponent component) {
	}

	@Override
	public long getSize() {
		return size;
	}

	@Override
	public List<FileSystemComponent> list() {
		return new ArrayList<>();
	}

	@Override
	public String toString(int indentationLevel) {
		return "\t".repeat(indentationLevel) + name + " Size: " + size;
	}
}

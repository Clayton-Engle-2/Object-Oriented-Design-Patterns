package structual.composite;

import java.util.List;

//Component
public abstract class FileSystemComponent {
	protected String name;

	public FileSystemComponent(String name) {
		this.name = name;
	}

	public abstract void add(FileSystemComponent component);

	public abstract void remove(FileSystemComponent component);

	public abstract long getSize();

	public abstract List<FileSystemComponent> list();

	public abstract String toString(int indentationLevel);
}

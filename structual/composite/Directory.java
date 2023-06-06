package structual.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Directory extends FileSystemComponent {
	private List<FileSystemComponent> components = new ArrayList<>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public void add(FileSystemComponent component) {
		components.add(component);
	}

	@Override
	public void remove(FileSystemComponent component) {
		components.remove(component);
	}

	@Override
	public long getSize() {
		return components.stream().mapToLong(FileSystemComponent::getSize).sum();
	}

	@Override
	public List<FileSystemComponent> list() {
		return components;
	}

	@Override
	public String toString(int indentationLevel) {
		StringBuilder sb = new StringBuilder("\t".repeat(indentationLevel) + name + " (Directory)\n");
		for (FileSystemComponent component : components) {
			sb.append(component.toString(indentationLevel + 1)).append("\n");
		}
		return sb.toString();
	}
}
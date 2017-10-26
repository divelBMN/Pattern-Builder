package pattern_builder.editor;

public class Prefix implements Editing {
	
	private final String prefix;
	
	public Prefix(String prefix) {
		this.prefix = prefix;
	}
	
	
	public String edit(String originalString) {
		return prefix + originalString;
	}
}

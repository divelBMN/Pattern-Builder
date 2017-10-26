package pattern_builder.editor;

public class Suffix implements Editing {
	
	private final String suffix;
	
	
	public Suffix(String suffix) {
		this.suffix = suffix;
	}
	
	
	public String edit(String originalString) {
		return originalString + this.suffix;
	}
}

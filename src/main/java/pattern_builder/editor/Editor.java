package pattern_builder.editor;

public class Editor {
	
	private Editing prefix;
	private Editing suffix;
	
	
	public Editor(final Editing postfixer,
	              final Editing suffixer) {
		this.prefix = postfixer;
		this.suffix = suffixer;
	}
	
	
	public String edit(final String originalString) {
		String string = originalString;
		string = this.prefix.edit(string);
		string = this.suffix.edit(string);
		
		return string;
	}
	
}

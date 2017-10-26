package pattern_builder.editor;

public class EditorBuilder {
	
	private Editing prefix;
	private Editing suffix;
	
	
	public EditorBuilder() {
		this.prefix = new PrefixDefault();
		this.suffix = new SuffixDefault();
	}
	
	
	public void setPrefix(String prefix) {
		this.prefix = new Prefix(prefix);
	}
	
	public void setSuffix(String suffix) {
		this.suffix = new Suffix(suffix);
	}
	
	public Editor build() {
		return new Editor(this.prefix,
						  this.suffix);
	}
}

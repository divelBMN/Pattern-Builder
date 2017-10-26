package pattern_builder;

import pattern_builder.editor.Editor;
import pattern_builder.editor.EditorBuilder;

public class Main {
	
	
	
	public static void main(String[] args) {
		String ORIGINAL = "original string";
		EditorBuilder editorBuilder;
		Editor editor;
		
		editorBuilder = new EditorBuilder();
		editor = editorBuilder.build();
		System.out.println("empty builder:");
		System.out.println(editor.edit(ORIGINAL));
		System.out.println();
		
		editorBuilder = new EditorBuilder();
		editorBuilder.setPrefix("prefix_");
		editor = editorBuilder.build();
		System.out.println("builder with prefix:");
		System.out.println(editor.edit(ORIGINAL));
		System.out.println();
		
		editorBuilder = new EditorBuilder();
		editorBuilder.setSuffix("_suffix");
		editor = editorBuilder.build();
		System.out.println("builder with suffix:");
		System.out.println(editor.edit(ORIGINAL));
		System.out.println();
		
		editorBuilder = new EditorBuilder();
		editorBuilder.setPrefix("prefix_");
		editorBuilder.setSuffix("_suffix");
		editor = editorBuilder.build();
		System.out.println("builder with prefix and suffix:");
		System.out.println(editor.edit(ORIGINAL));
	}

}

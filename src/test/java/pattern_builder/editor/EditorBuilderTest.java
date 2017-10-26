package pattern_builder.editor;

import org.junit.Test;

import static org.junit.Assert.*;

public class EditorBuilderTest {

	@Test
	public void testEmptyEditor() {
		EditorBuilder editorBuilder = new EditorBuilder();
		Editor editor = editorBuilder.build();
		assertTrue(editor.edit("original").equals("original"));
	}
	
	@Test
	public void testEditorWithPrefix() {
		EditorBuilder editorBuilder = new EditorBuilder();
		editorBuilder.setPrefix("prefix_");
		Editor editor = editorBuilder.build();
		assertTrue(editor.edit("original").equals("prefix_original"));
	}
	
	@Test
	public void testEditorWithSuffix() {
		EditorBuilder editorBuilder = new EditorBuilder();
		editorBuilder.setSuffix("_suffix");
		Editor editor = editorBuilder.build();
		assertTrue(editor.edit("original").equals("original_suffix"));
	}
	
	@Test
	public void testEditorWithPrefixAndSuffix() {
		EditorBuilder editorBuilder = new EditorBuilder();
		editorBuilder.setPrefix("prefix_");
		editorBuilder.setSuffix("_suffix");
		Editor editor = editorBuilder.build();
		assertTrue(editor.edit("original").equals("prefix_original_suffix"));
	}
	
}
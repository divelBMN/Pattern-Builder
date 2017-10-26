package pattern_builder.editor;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuffixDefaultTest {
	
	@Test
	public void edit() throws Exception {
		SuffixDefault suffix = new SuffixDefault();
		assertTrue(suffix.edit("original").equals("original"));
	}
	
}
package pattern_builder.editor;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuffixTest {
	
	@Test
	public void edit() throws Exception {
		Suffix suffix = new Suffix("_suffix");
		assertTrue(suffix.edit("original").equals("original_suffix"));
	}
	
}
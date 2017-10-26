package pattern_builder.editor;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixTest {
	
	@Test
	public void edit() throws Exception {
		Prefix prefix = new Prefix("prefix_");
		assertTrue(prefix.edit("original").equals("prefix_original"));
	}
	
}
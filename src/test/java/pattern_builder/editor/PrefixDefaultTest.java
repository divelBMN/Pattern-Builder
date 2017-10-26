package pattern_builder.editor;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixDefaultTest {
	
	@Test
	public void edit() throws Exception {
		PrefixDefault prefix = new PrefixDefault();
		assertTrue(prefix.edit("original").equals("original"));
	}
	
}
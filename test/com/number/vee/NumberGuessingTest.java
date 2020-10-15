package com.number.vee;

import org.junit.Before;
import org.junit.Test;

import com.number.guest.NumberGuessingImpl;

public class NumberGuessingTest {
	NumberGuessingImpl impl = null;

	@Before
	public void setUp() throws Exception {
		 impl = new NumberGuessingImpl();
	}

	@Test
	public void testStartQuiz() { 
		impl.startQuiz();
	}

	@Test
	public void testStartGuessing() {
		impl.startGuessing();
	}

}

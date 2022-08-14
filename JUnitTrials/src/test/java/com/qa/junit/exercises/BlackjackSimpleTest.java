package com.qa.junit.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BlackjackSimpleTest {
	@Test
	public void testNoWinnerOnDoubleBust() {
		int result = BlackjackSimple.play(25, 27);
		assertEquals("Expected: 0 output as no one wins", 0, result);
	}
	
	@Test
	public void testPlayerWinsIfDealerBust() {
		int result = BlackjackSimple.play(25, 6);
		assertEquals("Expected: 6 output for player win", 6, result);
	}
	
	@Test
	public void testDealerWinsIfPlayerBust() {
		int result = BlackjackSimple.play(21, 22);
		assertEquals("Expected: 21 output for dealer win", 21, result);
	}
	
	@Test
	public void testPlayerWinsIfTotalHigher() {
		int result = BlackjackSimple.play(14, 20);
		assertEquals("Expected: 20 output for player win", 20, result);
	}
	
	@Test
	public void testDealerWinsIfTotalHigher() {
		int result = BlackjackSimple.play(18, 14);
		assertEquals("Expected: 18 output for dealer win", 18, result);
	}
	
	@Test
	public void cardValueIsOutputForADraw() {
		int result = BlackjackSimple.play(16, 16);
		assertEquals("Expected: 18 output for draw", 16, result);
	}
}

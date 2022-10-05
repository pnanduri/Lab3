import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	Gradebook g1;
	Gradebook g;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new Gradebook(5); 
		g1.addScore(60.0); 
		g1.addScore(14.0); 
		g = new Gradebook(5);
		g.addScore(32.0);
		g.addScore(98.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g = null;
	}

	@Test 
	void testSum() {
		assertEquals(74.0, g1.sum(), .0001); 
		assertEquals(130.0, g.sum(), .0001); 
		}
	
	 @Test 
	 void testMinimum() {
		 assertEquals(14.0, g1.minimum(), .001); 
		 assertEquals(32.0, g.minimum(), .001); 
		 }
	
	 @Test 
	 void testFinalScore() {
		 assertEquals(60.0, g1.finalScore(), .0001); 
		 assertEquals(98.0, g.finalScore(), .0001); 
		 }
	
	@Test 
	void testAddScore() { 
		assertTrue((g1.toString()).equals(" 60.0 14.0 "));
		assertTrue((g.toString()).equals(" 32.0 98.0 "));
		assertEquals(2, g1.getScoreSize(), 0.001);
		assertEquals(2, g.getScoreSize(), 0.001); }
}

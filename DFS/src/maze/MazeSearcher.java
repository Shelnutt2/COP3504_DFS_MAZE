package maze;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MazeSearcher {

		@Test
		public void testComplex() {
			MazeCell cell = MazeSearch.searchMaze(new ExampleComplexMaze());
			
			Assert.assertNotNull(cell);
			Assert.assertTrue(cell.isFinish());
		}
		
		@Test
		public void testSimple() {
			MazeCell cell = MazeSearch.searchMaze(new ExampleMaze());
			
			Assert.assertNotNull(cell);
			Assert.assertTrue(cell.isFinish());
		}

		@Test
		public void testCycle() {
			MazeCell cell = MazeSearch.searchMaze(new ExampleMazeWithCycle());
			
			Assert.assertNotNull(cell);
			Assert.assertTrue(cell.isFinish());
		}
		
		@Test
		public void testDeadEnd() {
			MazeCell cell = MazeSearch.searchMaze(new DeadEndMaze());
			
			Assert.assertNull(cell);
		}
	

}

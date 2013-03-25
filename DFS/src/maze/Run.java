package maze;

import java.util.HashSet;

public class Run {

	private static Maze maze = new ExampleComplexMaze(); 

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MazeCell fcell = searchMaze(maze);
		
		System.out.println("Congratulations - destination reached!");
		System.out.println(fcell.toString());
	}
	
	public static MazeCell searchMaze(Maze maze){
		HashSet<MazeCell> beenthere = new HashSet<MazeCell>();
		DepthFirstSearch find = new DepthFirstSearch(maze.getStart(),beenthere);
		return find.getfinishcell();
		
		
	}
}

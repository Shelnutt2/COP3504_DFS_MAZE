package maze;


import java.util.HashSet;

/** 
 * Maze Searching class based on the Depth First Searching algorithm
 *  
 * 
 * @author Seth Shelnutt
 * @version 1.0*/
public class MazeSearch {

	/**
	 * Searches the maze for a finish cell
	 * 
	 * @param maze The maze you wish to search
	 */
	public static MazeCell searchMaze(Maze maze){
		HashSet<MazeCell> beenthere = new HashSet<MazeCell>(); //Create a HashSet to store cells we've visited in
		DepthFirstSearch find = new DepthFirstSearch(maze.getStart(),beenthere); //Initialize a new DFS class
		return find.getfinishcell(); //Return the finish cell
		
		
	}
}

/** 
 * Depth First Searching algorithm
 *  
 * 
 * @author Seth Shelnutt
 * @version 1.0*/

class DepthFirstSearch {
    private MazeCell fcell;
    
	/**
	 *Initializes the DFS with given maze and HashSet
	 * 
	 * @param cell MazeCell to start the search at
	 * @param beenthere A HashSet to keep track of where we've been.
	 */
	public DepthFirstSearch(MazeCell cell, HashSet<MazeCell> beenthere){
		search(cell,beenthere);

	}
	/**
	 * DFS search algorithm
	 * 
	 * @param cell MazeCell to start the search at
	 * @param beenthere A HashSet to keep track of where we've been.
	 */
    private void search(MazeCell cell, HashSet<MazeCell> beenthere){
        if(beenthere.contains(cell)) //Check to make sure we haven't been here already
        	return;
		if(!cell.isFinish()){ // Make sure the new cell isn't the finish cell
		  if(cell.north() != null){ //Check to make sure we can move in this direction
			beenthere.add(cell); //Add the current cell to the HashSet 
			search(cell.north(),beenthere); //Move to the new cell and continue the search 
		  }
		  if(cell.south() != null){ //Check to make sure we can move in this direction
	    	beenthere.add(cell); //Add the current cell to the HashSet
			search(cell.south(),beenthere); //Move to the new cell and continue the search
		  }
		  if(cell.east() != null){ //Check to make sure we can move in this direction
	    	beenthere.add(cell); //Add the current cell to the HashSet
			search(cell.east(),beenthere); //Move to the new cell and continue the search
		  }
		  if(cell.west() != null){ //Check to make sure we can move in this direction
	    	beenthere.add(cell); //Add the current cell to the HashSet
			search(cell.west(),beenthere); //Move to the new cell and continue the search
		  }
		}
		else if(cell.isFinish()){ //If the new cell is the finish cell set it.
			fcell = cell;
		}
		
    }
	public MazeCell getfinishcell() { //Get and return the finish cell
		return fcell;
		
	}

}

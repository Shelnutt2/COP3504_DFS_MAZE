package maze;


import java.util.HashSet;

public class DepthFirstSearch {
    private MazeCell fcell;

	public DepthFirstSearch(MazeCell cell, HashSet<MazeCell> beenthere){
		search(cell,beenthere);

	}
    private void search(MazeCell cell, HashSet<MazeCell> beenthere){
        if(beenthere.contains(cell))
        	return;
		if(!cell.isFinish()){
		  if(cell.north() != null){
			beenthere.add(cell);
			search(cell.north(),beenthere);
		  }
		  if(cell.south() != null){
	    	beenthere.add(cell);
			search(cell.south(),beenthere);
		  }
		  if(cell.east() != null){
	    	beenthere.add(cell);
			search(cell.east(),beenthere);
		  }
		  if(cell.west() != null){
	    	beenthere.add(cell);
			search(cell.west(),beenthere);
		  }
		}
		else if(cell.isFinish()){
			fcell = cell;
		}
		
    }
	public MazeCell getfinishcell() {
		return fcell;
		
	}

}

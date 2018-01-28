package battleshipAssignment;

//Due 29
public class HorizontalSearch implements BattleSearchStrategy {
	private int numCellsVisited = 0;
	private int numCellsFound = 0;
	
	@Override
	public void search(boolean[][] grid) {
		// TODO Auto-generated method stub
		int length = 25;
		for (int x = 0; x < length; x++) {
			for (int y = 0 ; y < length; y++) {
				if (grid[x][y]) {
					System.out.println("Ship found at (" + x + ", " + y + ")");
					numCellsFound++;
				}
				numCellsVisited++;
				if(numCellsFound >= 8) {
					break;
				}
			}
			if(numCellsFound >= 8) {
				break;
			}
		}
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Horizontal Search";
	}

	@Override
	public int numCellsVisited() {
		// TODO Auto-generated method stub
		return numCellsVisited;
	}

}

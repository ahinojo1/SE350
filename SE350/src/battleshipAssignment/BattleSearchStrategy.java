package battleshipAssignment;

public interface BattleSearchStrategy {
	public void search(boolean[][] grid);
	public String searchName();
	public int numCellsVisited();
}

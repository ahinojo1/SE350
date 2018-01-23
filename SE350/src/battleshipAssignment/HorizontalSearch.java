package battleshipAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class HorizontalSearch implements BattleSearchStrategy {
	private int numCellsVisited = 0;
	
	@Override
	public void search(boolean[][] grid) {
		// TODO Auto-generated method stub
		int length = 25;
		for (int x = 0; x < length; x++) {
			for (int y = 0 ; y < length; y++) {
				if (grid[x][y]) {
					//What am I checking??
				}
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

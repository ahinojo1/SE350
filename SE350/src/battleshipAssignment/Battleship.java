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

public class Battleship {
	BattleSearchStrategy SearchStrategy;
	public static  String fileName = "C:\\Users\\Antonio\\SE350\\SE350\\src\\battleshipAssignment\\input.txt";
	private int gridDimension = 25;
	public boolean[][] grid = new boolean[gridDimension][gridDimension];
	public Battleship() {
		SearchStrategy = new HorizontalSearch();
	}
	
	public void setStrategy(BattleSearchStrategy searchStrategy) {
		SearchStrategy = searchStrategy;
	}
	public void setInputFile(String newFileName) {
		fileName = newFileName;
	}
	public void setGridDimension(int dimension) {
		gridDimension = dimension;
	}
	
	public void readInputFile() {
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(file);
			String line;
			while((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, "(,)");
				String x = tokenizer.nextToken();
				System.out.println(x);
				String y = tokenizer.nextToken();
				System.out.println(y);
				//tokenizer.nextToken();
				//System.out.println(line);
				//tokenizer.nextToken();
				//System.out.println(line);
			}reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void playGame() {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pass in a text file with coordinates to be tokenized
		//choose strategy to search for ships (i.e. horizontal, random, special)
		Battleship battleship = new Battleship();
		battleship.playGame();
		battleship.readInputFile();
	}
}

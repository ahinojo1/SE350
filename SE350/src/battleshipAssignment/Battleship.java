package battleshipAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;

public class Battleship {
	BattleSearchStrategy SearchStrategy;
	public static  String fileName = "C:\\Users\\Antonio\\SE350\\SE350\\src\\battleshipAssignment\\input.txt";
	public static int gridDimension = 25;
	public boolean[][] grid = new boolean[gridDimension][gridDimension];
	ArrayList<int[]> shipPoints = new ArrayList<int[]>();
	
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
	public static int getGridDimension() {
		return gridDimension;
	}
	
	public void readInputFile() {
		try {
			FileReader file = new FileReader(new File(fileName));
			BufferedReader reader = new BufferedReader(file);
			String line;
			while((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, "(,)");
				String x = tokenizer.nextToken();
				System.out.println(x);
				String y = tokenizer.nextToken();
				System.out.println(y);
				tokenizer.nextToken();
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
	public void readInputFile2() {
		Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
			while (scanner.hasNextLine()) {
				String r = scanner.nextLine();
				String regex = "\\(|\\)";
				String[] result = r.split(regex);
				
				for(String str:result) {
					//
					//Should I do another split by comma and change to True for each coordinate?
					//Integer strInt = Integer.parseInt(str);
					
					System.out.println(str);
					//shipPoints.add(strInt);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void readInputFile3() {
		Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine()) {
				String record = scanner.nextLine();
				String regex = "\\(([0-9]+),([0-9]+)\\)";
				Pattern p = Pattern.compile(regex);
				Matcher matcher = p.matcher(record);
				while(matcher.find()) {
					int x = Integer.parseInt(matcher.group(1));
					int y = Integer.parseInt(matcher.group(2));
					//System.out.println("x = " + x + ", y = " + y);
					grid[x][y] = true;
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doSearch() {
		SearchStrategy.search(grid);
		System.out.println(SearchStrategy.searchName() + " visited " + SearchStrategy.numCellsVisited() + " number of cells");
	}
	
	public void playGame() {
		readInputFile3();
		doSearch();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pass in a text file with coordinates to be tokenized
		//choose strategy to search for ships (i.e. horizontal, random, special)
		Battleship battleship = new Battleship();
		battleship.playGame();
	}
}

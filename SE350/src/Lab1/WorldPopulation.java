package Lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {

	SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
		
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortStrategy = new BubbleSort(); // Set the default strategy here.	
	}

	
	public void readInputFile(){
		population = readPopulationFile("/src/Lab1/WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			while((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				 
				
				for (int i = 0; i < population.length - 1; i++) {
					String regionCell = tokenizer.nextToken();
					String yearCell = tokenizer.nextToken();
					Long populationCell = (long) Integer.parseInt(tokenizer.nextToken());
					population[i] = populationCell;
					//System.out.println(population[i]); //testing
				}
			}
				
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//??I think we add tokenized numbers into the array called population
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation(){		
		sortStrategy.sort(population);
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new InsertionSort()); //  Currently no strategies.
		worldPopulation.sortPopulation();
		worldPopulation.setStrategy(new SelectionSort());
		worldPopulation.sortPopulation();
	}

}

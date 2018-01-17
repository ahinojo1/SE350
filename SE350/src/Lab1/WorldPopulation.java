package Lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class WorldPopulation {

	SortStrategy sortStrategy;
	ArrayList<Long> population = new ArrayList<Long>();//[13484]; // Cheating because we know number of records!!
	Long[] popArray = new Long[13484];
		
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortStrategy = new BubbleSort(); // Set the default strategy here.	
	}

	
	public void readInputFile(){
		population = readPopulationFile("C:\\Users\\Antonio\\Documents\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public ArrayList<Long> readPopulationFile(String fileName){ //changed return type from long[] ArrayList<Long>
		
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			while((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				 //System.out.println(line);
				
				tokenizer.nextToken(); //removed assignments: no need to store as string variables
				tokenizer.nextToken();
				Long populationCell = Long.parseLong(tokenizer.nextToken());
				population.add(populationCell);
				//System.out.println(population[i]); //testing
			}
			reader.close();
			popArray = population.toArray(new Long[population.size()]);
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
		sortStrategy.sort(popArray);
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
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new SelectionSort());
		worldPopulation.sortPopulation();
	}

}

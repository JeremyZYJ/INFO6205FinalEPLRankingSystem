package main.java.neu.edu.info6205;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtil {
	/*
	 * read the csv file of the history of EPL, return an Arraylist of Hometeam. Awayteam, result ofevery match 
	 */
	public static List<EPLMatchResult> historyRead(String filename) {
		List<EPLMatchResult> history = new ArrayList<EPLMatchResult>();
		try(BufferedReader inLine = new BufferedReader(new FileReader(filename)); ) { 
			  String inputLine = inLine.readLine();
			  
			  while ((inputLine = inLine.readLine())!= null) { 
				  
				  String[] fields = inputLine.split(",");
				  
				  String matchDate = fields[1];
				  String kickOffTime = "null";
				  String homeTeam = fields[2];
				  String awayTeam = fields[3];
				  int ftHomeGoals = Integer.parseInt(fields[4]);
				  int ftAwayGoals = Integer.parseInt(fields[5]);
				  String ftResult = fields[6];
				  int htHomeGoals = Integer.parseInt(fields[7]);;
				  int htAwayGoals = Integer.parseInt(fields[8]);;
				  String htResult = fields[9];;
				  
				  
				  history.add(new EPLMatchResult (matchDate, kickOffTime, homeTeam, awayTeam, ftHomeGoals, ftAwayGoals, ftResult, htHomeGoals, htAwayGoals, htResult)); 
				  } 
			  } catch (IOException e) { 
				  e.printStackTrace(); 
				  }
		return history;
	}
}

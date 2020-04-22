package main.java.neu.edu.info6205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EPLSimulation { 
	
	public static List<EPLTeam> eplSimulation2020(List<EPLMatchResult> history){
		//2020 team set add by 2019-2020.csv
		Set<String> team2020 = new HashSet<String>();
		System.out.println("#########2020EPLSimulation#########");
		List<EPLMatchResult> history2019_2020 = new ArrayList<EPLMatchResult>();
		history2019_2020 = CSVUtil.historyRead("2019-2020.csv");
		for (EPLMatchResult i : history2019_2020) {
			team2020.add(i.getHomeTeam());
			team2020.add(i.getAwayTeam());
		}
		System.out.println("All team:");
		System.out.println(team2020);
		
		//create teamStatistics
		List<EPLTeam> teamStatistics = new ArrayList<EPLTeam>();
		for (String i: team2020) {
			teamStatistics.add(new EPLTeam(i));
		}
		//build a prob chart for teams
		
		//proceed 1000 times simulation
		int i = 1000;
		while (i > 0) {
			for (int m = 0; m < 20; m++) {
				for (int n = m; n < 20; n++) {
					String team1 = teamStatistics.get(m).getName();
					String team2 = teamStatistics.get(n).getName();
					
					double prob[] = TwoTeamProbForecast.probBetweenTwo(history, team1, team2);
					//double prob[] = {1.0/3,1.0/3,1.0/3};
					//random result of the match, use prob to decide with team win or draw!
					//team1 and team2 will have two match(both HomeTeam and AwayTeam)
					int j = 2;
					while( j >0) {
						double random = Math.random();
						if(random <= prob[0]) {
							teamStatistics.get(m).addWin();
							teamStatistics.get(n).addLose();
						}
						else if(random <= prob[0] + prob[1]) {
							teamStatistics.get(n).addWin();
							teamStatistics.get(m).addLose();
						}
						else {
							teamStatistics.get(n).addDraw();
							teamStatistics.get(m).addDraw();
						}
					j -=1 ;
					}
				}
			}
			i -= 1;
		}
		
		for (EPLTeam team : teamStatistics) {
			double totalPoints = team.getTeamPoints();
			double Points = totalPoints /1000;
			team.setTeamPoints(Points);
			team.setWinCount(team.getWinCount()/ 1000);
		}
		//result of Simulation
		List<EPLTeam> result = new ArrayList<EPLTeam>();
		result = DataStatistics.TeamPointSort(teamStatistics);
		
		return result;
	}
}

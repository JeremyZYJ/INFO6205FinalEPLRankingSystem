package main.java.neu.edu.info6205;

import java.util.List;

public class TwoTeamHistory {
	/*
	 * This class count the result of match between two specific teams in a specific history
	 */
	public static int[] historyBetweenTwo(List<EPLMatchResult> history, String team1, String team2) {
		//3 int numbers represent {team1 win matches, team2 win matches, draw}
		int result[] = {0,0,0};
		for (EPLMatchResult i : history) {
			if(isTeamMatch(i, team1, team2)) {
				if(i.isDraw()) {
					result[2] += 1;
				}
				else if(i.ftWinTeam().equals(team1)) {
					result[0] += 1;
				}
				else result[1] += 1;
			}
			else continue;
		}
		return result;
	}
	
	public static boolean isTeamMatch(EPLMatchResult result, String team1, String team2) {
		if(result.getHomeTeam().equals(team1)) {
			if (result.getAwayTeam().equals(team2)){
				return true;
			}
			else return false;
		}
		else if(result.getHomeTeam().equals(team2)) {
			if (result.getAwayTeam().equals(team1)){
				return true;
			}
			else return false;
		}
		else return false;
	}
}

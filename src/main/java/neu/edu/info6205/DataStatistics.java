package main.java.neu.edu.info6205;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataStatistics {
	//return the EPL team who has the most win count in a history
	public static EPLTeam WinMostTeam(List<EPLMatchResult> history) {
		List<EPLTeam> teamStatistics = new ArrayList<EPLTeam>();
		teamStatistics = WinMostSort(history);
		return teamStatistics.get(0);
	}
	
	//return the EPL team who has the most points in a history
	public static EPLTeam PointMostTeam(List<EPLMatchResult> history) {
		List<EPLTeam> teamStatistics = new ArrayList<EPLTeam>();
		teamStatistics = PointMostSort(history);
		return teamStatistics.get(0);
	}
	
	//sort the hisory by team's win count
	public static List<EPLTeam> WinMostSort(List<EPLMatchResult> history) {
		Set<String> team = new HashSet<String>();
		List<EPLTeam> teamStatistics = new ArrayList<EPLTeam>();
		for (EPLMatchResult i : history) {
			team.add(i.getHomeTeam());
			team.add(i.getAwayTeam());
		}
		//System.out.println(team);
		for (String i: team) {
			teamStatistics.add(new EPLTeam(i));
		}
		//System.out.println(teamStatistics);
		for (EPLMatchResult i : history) {
			if (i.isDraw()) {
				for(EPLTeam j : teamStatistics ) {
					if (j.getName().equals(i.getHomeTeam())){
						j.addDraw();
					}
					else if(j.getName().equals(i.getAwayTeam())) {
						j.addDraw();
					}
					else continue;
				}
			}
			else {
				for(EPLTeam j : teamStatistics ) {
					if (j.getName().equals(i.ftWinTeam())){
						j.addWin();;
					}
					else if(j.getName().equals(i.ftLoseTeam())) {
						j.addLose();
					}
					else continue;
				}
			}
		}
		
		teamStatistics.sort(new Comparator<EPLTeam>() {

			@Override
			public int compare(EPLTeam arg0, EPLTeam arg1) {
				// TODO Auto-generated method stub
				if (arg0.getWinCount() < arg1.getWinCount())  return 1;
				else if(arg0.getWinCount() > arg1.getWinCount()) return -1;
				else return 0;
			}
		});
		/*
		 * for (EPLTeam eplTeam : teamStatistics) { System.out.println(eplTeam); }
		 */
		return teamStatistics;
		
	}
	
	//sort the history by the team's point
	public static List<EPLTeam> PointMostSort(List<EPLMatchResult> history) {
		List<EPLTeam> teamStatistics = new ArrayList<EPLTeam>();
		teamStatistics = DataProcessing(history);
		
		teamStatistics.sort(new Comparator<EPLTeam>() {

			@Override
			public int compare(EPLTeam arg0, EPLTeam arg1) {
				// TODO Auto-generated method stub
				if (arg0.getTeamPoints() < arg1.getTeamPoints())  return 1;
				else if(arg0.getTeamPoints() > arg1.getTeamPoints()) return -1;
				else return 0;
			}
		});
		/*System.out.println("fengexian");
		for (EPLTeam eplTeam : teamStatistics) {
			System.out.println(eplTeam);
		}*/
		return teamStatistics;
		
	}
	public static List<EPLTeam> TeamPointSort(List<EPLTeam> teamStatistics){
		teamStatistics.sort(new Comparator<EPLTeam>() {

			@Override
			public int compare(EPLTeam arg0, EPLTeam arg1) {
				// TODO Auto-generated method stub
				if (arg0.getTeamPoints() < arg1.getTeamPoints())  return 1;
				else if(arg0.getTeamPoints() > arg1.getTeamPoints()) return -1;
				else return 0;
			}
		});
		return teamStatistics;
	}
	private static List<EPLTeam> DataProcessing(List<EPLMatchResult> history){
		Set<String> team = new HashSet<String>();
		List<EPLTeam> teamStatistics = new ArrayList<EPLTeam>();
		for (EPLMatchResult i : history) {
			team.add(i.getHomeTeam());
			team.add(i.getAwayTeam());
		}
		//System.out.println(team);
		for (String i: team) {
			teamStatistics.add(new EPLTeam(i));
		}
		//System.out.println(teamStatistics);
		for (EPLMatchResult i : history) {
			if (i.isDraw()) {
				for(EPLTeam j : teamStatistics ) {
					if (j.getName().equals(i.getHomeTeam())){
						j.addDraw();
					}
					else if(j.getName().equals(i.getAwayTeam())) {
						j.addDraw();
					}
					else continue;
				}
			}
			else {
				for(EPLTeam j : teamStatistics ) {
					if (j.getName().equals(i.ftWinTeam())){
						j.addWin();;
					}
					else if(j.getName().equals(i.ftLoseTeam())) {
						j.addLose();
					}
					else continue;
				}
			}
		}
		
		/*for (EPLTeam eplTeam : teamStatistics) {
			System.out.println(eplTeam);
		}*/
		return teamStatistics;
	}
}

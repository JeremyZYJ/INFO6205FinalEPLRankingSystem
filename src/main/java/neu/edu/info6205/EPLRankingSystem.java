package main.java.neu.edu.info6205;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EPLRankingSystem {
	public static void main(String[] args) {
		//Read 2000-2020 EPL history in csv file and store in each ArrayList
		List<EPLMatchResult> history2000_2001 = new ArrayList<EPLMatchResult>();
		history2000_2001 = CSVUtil.historyRead("2000-2001.csv");
		
		List<EPLMatchResult> history2001_2002 = new ArrayList<EPLMatchResult>();
		history2001_2002 = CSVUtil.historyRead("2001-2002.csv");
		
		List<EPLMatchResult> history2002_2003 = new ArrayList<EPLMatchResult>();
		history2002_2003 = CSVUtil.historyRead("2002-2003.csv");
		
		List<EPLMatchResult> history2003_2004 = new ArrayList<EPLMatchResult>();
		history2003_2004 = CSVUtil.historyRead("2003-2004.csv");
		
		List<EPLMatchResult> history2004_2005 = new ArrayList<EPLMatchResult>();
		history2004_2005 = CSVUtil.historyRead("2004-2005.csv");
		
		List<EPLMatchResult> history2005_2006 = new ArrayList<EPLMatchResult>();
		history2005_2006 = CSVUtil.historyRead("2005-2006.csv");
		
		List<EPLMatchResult> history2006_2007 = new ArrayList<EPLMatchResult>();
		history2006_2007 = CSVUtil.historyRead("2006-2007.csv");
		
		List<EPLMatchResult> history2007_2008 = new ArrayList<EPLMatchResult>();
		history2007_2008 = CSVUtil.historyRead("2007-2008.csv");
		
		List<EPLMatchResult> history2008_2009 = new ArrayList<EPLMatchResult>();
		history2008_2009 = CSVUtil.historyRead("2008-2009.csv");
		
		List<EPLMatchResult> history2009_2010 = new ArrayList<EPLMatchResult>();
		history2009_2010 = CSVUtil.historyRead("2009-2010.csv");
		
		List<EPLMatchResult> history2010_2011 = new ArrayList<EPLMatchResult>();
		history2010_2011 = CSVUtil.historyRead("2010-2011.csv");
		
		List<EPLMatchResult> history2011_2012 = new ArrayList<EPLMatchResult>();
		history2011_2012 = CSVUtil.historyRead("2011-2012.csv");
		
		List<EPLMatchResult> history2012_2013 = new ArrayList<EPLMatchResult>();
		history2012_2013 = CSVUtil.historyRead("2012-2013.csv");
		
		List<EPLMatchResult> history2013_2014 = new ArrayList<EPLMatchResult>();
		history2013_2014 = CSVUtil.historyRead("2013-2014.csv");
		
		List<EPLMatchResult> history2014_2015 = new ArrayList<EPLMatchResult>();
		history2014_2015 = CSVUtil.historyRead("2014-2015.csv");
		
		List<EPLMatchResult> history2015_2016 = new ArrayList<EPLMatchResult>();
		history2015_2016 = CSVUtil.historyRead("2015-2016.csv");
		
		List<EPLMatchResult> history2016_2017 = new ArrayList<EPLMatchResult>();
		history2016_2017 = CSVUtil.historyRead("2016-2017.csv");

		List<EPLMatchResult> history2017_2018 = new ArrayList<EPLMatchResult>();
		history2017_2018 = CSVUtil.historyRead("2017-2018.csv");

		List<EPLMatchResult> history2018_2019 = new ArrayList<EPLMatchResult>();
		history2018_2019 = CSVUtil.historyRead("2018-2019.csv");

		List<EPLMatchResult> history2019_2020 = new ArrayList<EPLMatchResult>();
		history2019_2020 = CSVUtil.historyRead("2019-2020.csv");
		
		//Full history through 2000-2020
		List<EPLMatchResult> history = new ArrayList<EPLMatchResult>();
		history.addAll(history2000_2001);
		history.addAll(history2001_2002);
		history.addAll(history2002_2003);
		history.addAll(history2003_2004);
		history.addAll(history2004_2005);
		history.addAll(history2005_2006);
		history.addAll(history2006_2007);
		history.addAll(history2007_2008);
		history.addAll(history2008_2009);
		history.addAll(history2009_2010);
		history.addAll(history2010_2011);
		history.addAll(history2011_2012);
		history.addAll(history2012_2013);
		history.addAll(history2013_2014);
		history.addAll(history2014_2015);
		history.addAll(history2015_2016);
		history.addAll(history2016_2017);
		history.addAll(history2017_2018);
		history.addAll(history2018_2019);
		history.addAll(history2019_2020);
		/*
		//test historyBetweenTwo Function
		
		int result[] = TwoTeamHistory.historyBetweenTwo(history, "Liverpool", "Man City");
		for (int i = 0; i<3; i++) {
			System.out.println(result[i]);
		}
		//test TwoTeamProbForcast Function
		
		double prob[] = TwoTeamProbForecast.probBetweenTwo(history, "Liverpool", "Man City");
		for (int i = 0; i<3; i++) {
			System.out.println(prob[i]);
		}
		*/
		System.out.println("#######Welcome to EPL data search and forecast simulation system!#########");
		Scanner input=new Scanner(System.in);
		while (true){
			System.out.println("Input '1' to search history data.");
			System.out.println("Input '2' to enter 2020EPL Simulation System.");
			System.out.println("Input '3' to quit.");
			int n = input.nextInt();
			if (n == 1) {
				while(true) {
					System.out.println("###EPL history data System! Input '0' to back to main menu");
					System.out.println("Input years to search the data of that year(2000-2019)");
					int m = input.nextInt();
					if (m == 0) {
						break;
					}
					else if ( m >= 2000 && m <=2019) {
						List<EPLMatchResult> historyChoose = new ArrayList<EPLMatchResult>();
						if (m == 2000) {
							historyChoose = history2000_2001;
						}
						else if(m == 2001) {
							historyChoose = history2001_2002;
						}
						else if(m == 2001) {
							historyChoose = history2001_2002;
						}
						else if(m == 2002) {
							historyChoose = history2002_2003;
						}
						else if(m == 2003) {
							historyChoose = history2003_2004;
						}
						else if(m == 2004) {
							historyChoose = history2004_2005;
						}
						else if(m == 2005) {
							historyChoose = history2005_2006;
						}
						else if(m == 2006) {
							historyChoose = history2006_2007;
						}
						else if(m == 2007) {
							historyChoose = history2007_2008;
						}
						else if(m == 2008) {
							historyChoose = history2008_2009;
						}
						else if(m == 2009) {
							historyChoose = history2009_2010;
						}
						else if(m == 2011) {
							historyChoose = history2011_2012;
						}
						else if(m == 2012) {
							historyChoose = history2012_2013;
						}
						else if(m == 2013) {
							historyChoose = history2013_2014;
						}
						else if(m == 2014) {
							historyChoose = history2014_2015;
						}
						else if(m == 2015) {
							historyChoose = history2015_2016;
						}
						else if(m == 2016) {
							historyChoose = history2016_2017;
						}
						else if(m == 2017) {
							historyChoose = history2017_2018;
						}
						else if(m == 2018) {
							historyChoose = history2018_2019;
						}
						else{
							historyChoose = history2019_2020;
						}
						System.out.println("####Show the team with most wins, input 1:");
						System.out.println("####Show the team with most points, input 2:");
						System.out.println("####Show the team sorted with wins, input 3");
						System.out.println("####Show the team sorted with points, input 4");
						int k = input.nextInt();
						if (k == 1) {
							EPLTeam team = DataStatistics.WinMostTeam(historyChoose);
							System.out.println(team);
						}
						else if(k ==2) {
							EPLTeam team = DataStatistics.PointMostTeam(historyChoose);
							System.out.println(team);
						}
						else if(k ==3) {
							List<EPLTeam> team = new ArrayList<EPLTeam>();
							team = DataStatistics.WinMostSort(historyChoose);
							for (EPLTeam arg: team) {
								System.out.println(arg);
							}
						}
						else if(k ==4) {
							List<EPLTeam> team = new ArrayList<EPLTeam>();
							team = DataStatistics.PointMostSort(historyChoose);
							for (EPLTeam arg: team) {
								System.out.println(arg);
							}
						}
						else System.out.println("Illegal Input!");                   
					}
					else {
						System.out.println("Illegal Input! Please input again");
					}
				}
			}
			else if (n == 2) {
				List<EPLTeam> result = new ArrayList<EPLTeam>();
				result = EPLSimulation.eplSimulation2020(history);
				System.out.println("##Result##");
				for (EPLTeam i : result) {
					System.out.println(i);
				}
			}
			else if (n == 3) {
				break;
			}
			else {
				System.out.println("Illegal Input! Please input again");
				continue;
			}
		}
		
		//Demo for DataStatistics:
		//DataStatisticsDemo.demo();
		//EPLSimulation for 2020
				/*List<EPLTeam> result = new ArrayList<EPLTeam>();
				result = EPLSimulation.eplSimulation2020(history);
				System.out.println("##Result##");
				for (EPLTeam i : result) {
					System.out.println(i);
				}*/
	}
}

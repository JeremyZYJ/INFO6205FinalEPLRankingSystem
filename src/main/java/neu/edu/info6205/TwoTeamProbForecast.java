package main.java.neu.edu.info6205;

import java.util.List;

public class TwoTeamProbForecast {
	public static double[] probBetweenTwo(List<EPLMatchResult> history, String team1, String team2) {
		int result[] = TwoTeamHistory.historyBetweenTwo(history, team1, team2);
		double sum = (double)(result[0] + result[1] + result[2]);
		double prob[] = {1.0/3,1.0/3,1.0/3};
		if (sum!=0) {
			for(int i = 0; i<3; i++) prob[i] = result[i]/sum;
		}
		return prob;
	}
}

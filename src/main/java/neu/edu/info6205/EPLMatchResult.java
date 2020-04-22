package main.java.neu.edu.info6205;

public class EPLMatchResult {
	private String matchDate;
	private String kickOffTime;
	private String homeTeam;
	private String awayTeam;
	private int ftHomeGoals;
	private int ftAwayGoals;
	private String ftResult;
	private int htHomeGoals;
	private int htAwayGoals;
	private String htResult;
	
	public EPLMatchResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EPLMatchResult(String matchDate, String kickOffTime, String homeTeam, String awayTeam, int ftHomeGoals,
			int ftAwayGoals, String ftResult, int htHomeGoals, int htAwayGoals, String htResult) {
		super();
		this.matchDate = matchDate;
		this.kickOffTime = kickOffTime;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.ftHomeGoals = ftHomeGoals;
		this.ftAwayGoals = ftAwayGoals;
		this.ftResult = ftResult;
		this.htHomeGoals = htHomeGoals;
		this.htAwayGoals = htAwayGoals;
		this.htResult = htResult;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getKickOffTime() {
		return kickOffTime;
	}

	public void setKickOffTime(String kickOffTime) {
		this.kickOffTime = kickOffTime;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getFtHomeGoals() {
		return ftHomeGoals;
	}

	public void setFtHomeGoals(int ftHomeGoals) {
		this.ftHomeGoals = ftHomeGoals;
	}

	public int getFtAwayGoals() {
		return ftAwayGoals;
	}

	public void setFtAwayGoals(int ftAwayGoals) {
		this.ftAwayGoals = ftAwayGoals;
	}

	public String getFtResult() {
		return ftResult;
	}

	public void setFtResult(String ftResult) {
		this.ftResult = ftResult;
	}

	public int getHtHomeGoals() {
		return htHomeGoals;
	}

	public void setHtHomeGoals(int htHomeGoals) {
		this.htHomeGoals = htHomeGoals;
	}

	public int getHtAwayGoals() {
		return htAwayGoals;
	}

	public void setHtAwayGoals(int htAwayGoals) {
		this.htAwayGoals = htAwayGoals;
	}

	public String getHtResult() {
		return htResult;
	}

	public void setHtResult(String htResult) {
		this.htResult = htResult;
	}
	
	public String ftWinTeam() {
		if(ftResult.equals("H")){
			return homeTeam;
		}
		else if(ftResult.equals("A")) {
			return awayTeam;
		}
		else return null;
	}
	public int ftWinScore() {
		if(ftResult.equals("H")){
			return ftHomeGoals;
		}
		else if(ftResult.equals("A")) {
			return ftAwayGoals;
		}
		else return 0;
	}
	public String ftLoseTeam() {
		if(ftResult.equals("H")){
			return awayTeam;
		}
		else if(ftResult.equals("A")) {
			return homeTeam;
		}
		else return null;
	}
	public int ftLoseScore() {
		if(ftResult.equals("H")){
			return ftAwayGoals;
		}
		else if(ftResult.equals("A")) {
			return ftHomeGoals;
		}
		else return 0;
	}
	public boolean isDraw() {
		if (ftResult.equals("D")) {
			return true;
		}
		else return false;
	}

	/*@Override
	public String toString() {
		return "MatchResult [matchDate=" + matchDate + ", kickOffTime=" + kickOffTime + ", homeTeam=" + homeTeam
				+ ", awayTeam=" + awayTeam + ", ftHomeGoals=" + ftHomeGoals + ", ftAwayGoals=" + ftAwayGoals
				+ ", ftResult=" + ftResult + ", htHomeGoals=" + htHomeGoals + ", htAwayGoals=" + htAwayGoals
				+ ", htResult=" + htResult + "]";
	}*/

	/*@Override
	public String toString() {
		if (ftResult.equals("H")) {
			return "MatchResult on " + matchDate+ ":"
					+ "\n\t"+ homeTeam + " win " + awayTeam + 
					"\n\t" + " score: " + Integer.toString(ftHomeGoals) + ":" + Integer.toString(ftAwayGoals) ;
		}
		else if(ftResult.equals("A")) {
			return "MatchResult on" + matchDate+ ":"
					+ "\n\t"+ awayTeam + " win " + homeTeam + 
					"\n\t"  + " score: " + Integer.toString(ftAwayGoals) + ":" + Integer.toString(ftHomeGoals) ;
		}
		else if(ftResult.equals("D")) {
			return "MatchResult on" + matchDate+ ":"
					+ "\n\t"+ awayTeam + " and " + homeTeam + " drew"+
					"\n\t" + " score: " + Integer.toString(ftAwayGoals) + ":" + Integer.toString(ftHomeGoals) ;
		}
		else return "MatchResult false!" + ftResult;
	}*/
	public String toString() {
		if (this.isDraw()){
			return "MatchResult on" + matchDate+ ":"
					+ "\n\t"+ awayTeam + " and " + homeTeam + " drew"+
					"\n\t" + " score: " + Integer.toString(ftAwayGoals) + ":" + Integer.toString(ftHomeGoals) ;
		}
		else {
			return "MatchResult on " + matchDate+ ":"
					+ "\n\t"+ this.ftWinTeam() + " win " + this.ftLoseTeam() + 
					"\n\t" + " score: " + Integer.toString(this.ftWinScore()) + ":" + Integer.toString(this.ftLoseScore()) ;
		}
	}
	
	
	
	
}

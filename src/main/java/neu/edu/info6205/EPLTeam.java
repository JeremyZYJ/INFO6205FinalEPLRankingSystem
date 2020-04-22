package main.java.neu.edu.info6205;

import java.io.Serializable;

public class EPLTeam{
	private String name;
	private int winCount = 0;
	private int loseCount = 0;
	private int drawCount = 0;
	private double teamPoints = 0;
	
	public EPLTeam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EPLTeam(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	public int getLoseCount() {
		return loseCount;
	}

	public void setLoseCount(int loseCount) {
		this.loseCount = loseCount;
	}

	public int getDrawCount() {
		return drawCount;
	}

	public void setDrawCount(int drawCount) {
		this.drawCount = drawCount;
	}

	public double getTeamPoints() {
		return teamPoints;
	}

	public void setTeamPoints(double teamPoints) {
		this.teamPoints = teamPoints;
	}
	
	public void addWin() {
		this.winCount += 1;
		this.teamPoints += 3;
	}
	public void addLose() {
		this.loseCount += 1;
	}
	public void addDraw() {
		this.drawCount += 1;
		this.teamPoints +=1;
	}

	@Override
	public String toString() {
		//return "EPLTeam [name=" + name + ", winCount=" + winCount + ", loseCount=" + loseCount + ", drawCount="
		//		+ drawCount + ", teamPoints=" + teamPoints + "]";
		return "Team: " + name + " \n\tPoints: " + teamPoints+ "\tWinMatches: " + winCount;
				// "\n\t" + "winCount=" + winCount + ", loseCount=" + loseCount + ", drawCount=" +drawCount;
	}
}

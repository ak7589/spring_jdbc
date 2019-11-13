package com.pluralsight.corejava.generics;

import java.util.ArrayList;

public class Team {
	
	private String name;
	
	int played =0;
	int won =0;
	int lost =0;
	int tied =0;
	
	private ArrayList<Player> members = new ArrayList<Player>();
	
	
	public Team(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	//Method to add players in a team
	public boolean addPlayer(Player player) {
		
		if (members.contains(player)) {
			System.out.println("Player : " + player.getName() + " Already part of this team : " + this.getName());
			return false;
		}
		else {
			members.add(player);
			System.out.println("Player : " + player.getName() + " Added to the  team : "  + this.getName());
			return true;
		}
		
	}
	
	//Method to return number of player in the team
	public int numOfPlayer() {
		return members.size();
	}
	
	//Method to calculate result of match
	public void matchResult(Team otherTeam, int ourScore, int theirScore) {
		
		if(ourScore > theirScore) {
			won++;
		}
		else if (ourScore == theirScore) {
			tied++;
		}
		else
		{
			lost++;
		}
		
		//Update scores of other team as well
		if(otherTeam != null)
		{
			otherTeam.matchResult(null, ourScore, theirScore);
		}
		
	}
	
	

}

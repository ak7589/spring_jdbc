package com.pluralsight.corejava.generics;

public class TeamSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi Amit, Welcome to core java...");
		
		//Below are player objects
		Player basketBall = new BasketballPlayer("player1");
		Player foootBall = new FootballPlayer("player2");
		Player socer = new SocerPlayer("socer1");
		
		//Cosntruct team object
		Team team1 = new Team("King International");
		
		//Add players to the team
		team1.addPlayer(basketBall);
		team1.addPlayer(foootBall);
		team1.addPlayer(socer);
		
		
		team1.addPlayer(basketBall);
		
		//Get No of players in the team
		System.out.println("No of players in " + team1.getName() + " are : " + team1.numOfPlayer());
		

	}

}

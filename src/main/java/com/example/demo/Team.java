package com.example.demo;

//Lombok
public class Team {

    public Team(String teamName, int numberOfPlayers, String coachName) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
        this.coachName = coachName;

    }

    private String teamName;
    private int numberOfPlayers;
    private String coachName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
}

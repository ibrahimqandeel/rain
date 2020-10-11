package com.example.demo;

//Lombok
public class TeamDto {

    public TeamDto(String teamName, int numberOfPlayers) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
    }

    private String teamName;
    private int numberOfPlayers;

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

}

package com.example.demo;

import java.util.Optional;

public interface TeamService {

    void createTeam(TeamDto newRec);

    Optional<TeamDto> getTeamByName(String teamName);

    Optional<AllTeamsDto> getAllTeams();

}

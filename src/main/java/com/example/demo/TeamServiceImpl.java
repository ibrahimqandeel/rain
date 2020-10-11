package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    private final List<TeamDto> teamsList;

    public TeamServiceImpl(List<TeamDto> teamsList) {
        this.teamsList = teamsList;
    }

    @Override
    public void createTeam(TeamDto newRec) {
        teamsList.add(newRec);
    }

    @Override
    public Optional<TeamDto> getTeamByName(String teamName) {
        if (teamsList != null && teamsList.size() > 0) {
            for (int i = 0; i < teamsList.size(); i++) {
                if (teamName.equalsIgnoreCase(teamsList.get(i).getTeamName())) {
                    return Optional.ofNullable(teamsList.get(i));
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<AllTeamsDto> getAllTeams() {
        AllTeamsDto allTeamsDto = new AllTeamsDto();
        allTeamsDto.setTeams(teamsList);
        return Optional.of(allTeamsDto);
    }
}

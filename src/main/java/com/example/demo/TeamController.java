package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<Void> createTeam(@RequestBody CreateTeamRequest createTeamRequest) {
        teamService.createTeam(createTeamRequest.getRequestBody());
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<AllTeamsDto> getAllTeamsInfo() {
        return new ResponseEntity<>(teamService.getAllTeams().get(), HttpStatus.OK);
    }

    @GetMapping(path = "/{teamName}")
    public ResponseEntity<TeamDto> getTeamInfo(@PathVariable String teamName) {
        Optional<TeamDto> teamDto = teamService.getTeamByName(teamName);
        if (teamDto.isPresent()) {
            return new ResponseEntity<>(teamDto.get(), HttpStatus.FOUND);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}

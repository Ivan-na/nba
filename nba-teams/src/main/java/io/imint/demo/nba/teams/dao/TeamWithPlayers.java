package io.imint.demo.nba.teams.dao;

import java.util.List;

/**
 *
 * <p>Desc</p>
 *
 * @author  idong
 * @version V1.0, May 9, 2016 4:10:10 PM
 */
public class    TeamWithPlayers extends Team {
    private List<Player> players;

    public TeamWithPlayers(Team team, List<Player> players) {
        super(team.getId(), team.getName(), team.getZone(), team.getDivision(), team.getCity());
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}

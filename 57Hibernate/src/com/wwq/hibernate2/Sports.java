package com.wwq.hibernate2;

import java.util.Set;

public class Sports {
	private int id;
	private String sports_name;
	private Set<Player> playerSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSports_name() {
		return sports_name;
	}

	public void setSports_name(String sports_name) {
		this.sports_name = sports_name;
	}

	public Set<Player> getPlayerSet() {
		return playerSet;
	}

	public void setPlayerSet(Set<Player> playerSet) {
		this.playerSet = playerSet;
	}

}

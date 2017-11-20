package com.wwq.hibernate2;

import java.util.Set;

public class Player {
	private int id;
	private String player_name;
	private Set<Sports> sportsSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public Set<Sports> getSportsSet() {
		return sportsSet;
	}

	public void setSportsSet(Set<Sports> sportsSet) {
		this.sportsSet = sportsSet;
	}

}

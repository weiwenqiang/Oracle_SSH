package com.wwq.cinema.entity;

/**
 * FilmInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class FilmInfo implements java.io.Serializable {
	private static final long serialVersionUID = -2614368514452969412L;
	private Long filmId;
	private String filmName;
	private String typeId;
	private String actor;
	private String director;
	private Long ticketPrice;

	// Constructors

	/** default constructor */
	public FilmInfo() {
	}

	/** minimal constructor */
	public FilmInfo(String filmName, String typeId, Long ticketPrice) {
		this.filmName = filmName;
		this.typeId = typeId;
		this.ticketPrice = ticketPrice;
	}

	/** full constructor */
	public FilmInfo(String filmName, String typeId, String actor,
			String director, Long ticketPrice) {
		this.filmName = filmName;
		this.typeId = typeId;
		this.actor = actor;
		this.director = director;
		this.ticketPrice = ticketPrice;
	}

	// Property accessors

	public Long getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

	public String getFilmName() {
		return this.filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Long getTicketPrice() {
		return this.ticketPrice;
	}

	public void setTicketPrice(Long ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
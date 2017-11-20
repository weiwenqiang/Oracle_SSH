package com.wwq.cinema.entity;

/**
 * FilmType entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class FilmType implements java.io.Serializable {
	private static final long serialVersionUID = 5209516593666725063L;
	private String typeId;
	private String typeName;

	// Constructors

	/** default constructor */
	public FilmType() {
	}

	/** full constructor */
	public FilmType(String typeName) {
		this.typeName = typeName;
	}

	// Property accessors

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
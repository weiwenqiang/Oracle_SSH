package com.wwq.spring.four;

import java.util.List;

public class ClassRoom {
	private int roomId;
	private List list;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public ClassRoom(int roomId, List list) {
		super();
		this.roomId = roomId;
		this.list = list;
	}
	public ClassRoom() {
		super();
	}
	
	
}

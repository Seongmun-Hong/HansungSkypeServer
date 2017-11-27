package server;

import java.util.Vector;

public class UserInfo {
	
	private String name;
	private String stateMessage;
	private boolean connectionState;
	private String image;
	private String ip;
	private String id;
	private Vector<UserInfo> friends;
	
	public UserInfo(String name) {
		this.name = name;
		this.stateMessage = "";
		image = null;
		connectionState = false;
		ip = null;
		friends = new Vector<UserInfo>();
	}
	
	public UserInfo(String name, String image) {
		this.name = name;
		this.stateMessage = "";
		this.image = image;
		connectionState = false;
		ip = null;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getStateMessage() {
		return stateMessage;
	}

	public void setStateMessage(String stateMessage) {
		this.stateMessage = stateMessage;
	}

	public boolean isConnectionState() {
		return connectionState;
	}

	public void setConnectionState(boolean connectionState) {
		this.connectionState = connectionState;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}
	
	public void addFriends(UserInfo user) {
		friends.add(user);
	}
	
	public Vector<UserInfo> getFriends() {
		return friends;
	}
	
	
}

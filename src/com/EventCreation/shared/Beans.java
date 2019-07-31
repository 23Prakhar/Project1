package com.EventCreation.shared; 
import java.io.Serializable;

public class Beans implements Serializable{

public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
public String name;
public String venue;
public String date;
public String time;
public String about;
}


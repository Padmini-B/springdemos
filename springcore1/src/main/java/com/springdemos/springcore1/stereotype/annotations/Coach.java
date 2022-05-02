package com.springdemos.springcore1.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("supercoach")
@Scope("prototype")
public class Coach {
	@Value("11")
	private int id;
	
	@Value("Max")
	private String name;
	
	@Value("${dbuser}")
	private String dbuser;
	
	@Value("#{topics}")
	private List<String> Topics;
	
	@Autowired
	private CoachProfile coachProfile;
	
//	public Coach(CoachProfile coachProfile) {
//		this.coachProfile=coachProfile;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getTopics() {
		return Topics;
		
	}
	public void setTopics(List<String> topics) {
		Topics = topics;
	}
	
	public CoachProfile getCoachProfile() {
		return coachProfile;
		
	}
	public void setCoachProfile(CoachProfile coachProfile) {
		this.coachProfile = coachProfile;
		
	}
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbuser=" + dbuser + ", Topics=" + Topics + ", coachProfile="
				+ coachProfile + "]";
	}
}

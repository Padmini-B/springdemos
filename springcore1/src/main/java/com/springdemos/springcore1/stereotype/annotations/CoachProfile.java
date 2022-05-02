package com.springdemos.springcore1.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoachProfile {
	@Value("Cricket Coach")
	private String title;
	
	@Value("XYZ company")
	private String Company;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "CoachProfile [title=" + title + ", Company=" + Company + "]";
	}
}

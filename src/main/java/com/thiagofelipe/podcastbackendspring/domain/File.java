package com.thiagofelipe.podcastbackendspring.domain;

import javax.persistence.Embeddable;

@Embeddable
public class File{

	private String url;
	private String type;
	private Integer duration;
	


	public File() {
		
	}
	
	public File(String url, String type, Integer duration) {
	
		this.url = url;
		this.type = type;
		this.duration = duration;
	
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	


	@Override
	public String toString() {
		return "File [url=" + url + ", type=" + type + ", duration=" + duration + "]";
	}
	
	
	
}

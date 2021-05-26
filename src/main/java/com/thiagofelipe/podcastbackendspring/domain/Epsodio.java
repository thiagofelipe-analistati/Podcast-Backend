package com.thiagofelipe.podcastbackendspring.domain;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Epsodio implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;    
	private String title;
	private String members;
	private String published_at;
	private String thumbnail;
	 @Lob
	private String description;
	  @Embedded
	  @AttributeOverrides({
	      @AttributeOverride(name = "url", column = @Column(name = "url")),
	      @AttributeOverride(name = "type", column = @Column(name = "type")),
	      @AttributeOverride(name = "duration", column = @Column(name = "duration"))
	  })
	 private File file;
	


	
	public Epsodio() {
		
	}
	public Epsodio( String id, String title, String members, String published_at, String thumbnail, String description
			, File file) {
	
		this.id = id;
		this.title = title;
		this.members = members;
		this.published_at = published_at;
		this.thumbnail = thumbnail;
		
		this.description = description;
		this.file= file;
	
	
	}

	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public String getPublished_at() {
		return published_at;
	}
	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	@Override
	public String toString() {
		return "Epsodio [id=" + id + ", title=" + title + ", members=" + members + ", published_at=" + published_at
				+ ", thumbnail=" + thumbnail + ", description=" + description + "]";
	}
}

package com.example.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Speaker {

	private String id;

	private String firstName;

	private String lastName;

	private String twitter;

	private String bio;

	public Speaker() {
	}

	public Speaker(String firstName, String lastName, String twitter) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.twitter = twitter;
	}

	public String getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getBio() {
		return this.bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Speaker speaker = (Speaker) o;

		if (id != null ? !id.equals(speaker.id) : speaker.id != null) return false;
		if (firstName != null ? !firstName.equals(speaker.firstName) : speaker.firstName != null)
			return false;
		if (lastName != null ? !lastName.equals(speaker.lastName) : speaker.lastName != null)
			return false;
		if (twitter != null ? !twitter.equals(speaker.twitter) : speaker.twitter != null)
			return false;
		return bio != null ? bio.equals(speaker.bio) : speaker.bio == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (twitter != null ? twitter.hashCode() : 0);
		result = 31 * result + (bio != null ? bio.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Speaker{");
		sb.append("id='").append(id).append('\'');
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", twitter='").append(twitter).append('\'');
		sb.append(", bio='").append(bio).append('\'');
		sb.append('}');
		return sb.toString();
	}
}

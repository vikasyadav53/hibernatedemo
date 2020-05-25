package com.vikas.hibernate.example.chapter4.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
public class AudioDisc4 extends Disc{
	@Column
	int trackCount;
	@Column
	String artist;

	public AudioDisc4() {
	}

	public AudioDisc4(int trackCount, String artist) {
		this.trackCount = trackCount;
		this.artist = artist;
	}

	public int getTrackCount() {
		return trackCount;
	}

	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}

package com.carwash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ratings")
public class Ratings 
{
	@Id
	int wid;
	
	int cid;

	

	int rating;
	String washerName;
	String comment;

	
	public Ratings()
	{
		
	}
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() 
	{
		return "RatingDetails [washerid = " + wid + ",customerid = "+cid+" ,rating=" + rating + ", washerName=" + washerName + ", comment=" + comment + "]";
	}
}

/**
 * (c) 2007 Eventful, Inc.
 * All rights reserved
 * 
 * Please see the accompanying LICENSE file for licensing information
 */
package com.evdb.javaapi.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.evdb.javaapi.util.DateAdapter;

/**
 * Comment Object
 * @author tylerv
 *
 */
@XmlRootElement(name="comment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Comment {
	
    /**
     * Comment ID
     */
	@XmlAttribute
	private int id;
	
	/**
	 * Comment text
	 */
	private String text;
	
	/**
	 * Username who generated the comment
	 */
	private String username;
	
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date time;
	
	/**
	 * Create a new comment
	 */
	public Comment() {
	}
	
	/**
	 * Create a comment with the given text
	 * @param text
	 */
	public Comment(String text) {
		this.text = text;
	}
	
	/**
	 * Return comment ID
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Set comment ID
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Return comment text
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * Set comment text
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * Get the time the comment was made
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * Set the comment time
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * Username that made the comment
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Set the name of the user making the comment
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}

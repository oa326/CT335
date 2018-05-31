/**
 * (c) 2007 Eventful, Inc.
 * All rights reserved
 * 
 * Please see the accompanying LICENSE file for licensing information
 */
package com.evdb.javaapi.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Image object
 * @author tylerv
 *
 */
@XmlRootElement(name="image")
@XmlAccessorType(XmlAccessType.FIELD)
public class Image {
	
    /**
     * Id of the image
     */
	private String id;
	
	/**
	 * Image caption
	 */
	private String caption;
	
	/**
	 * USer who created the images
	 */
	private String creator;
	
	/**
	 * Image source
	 */
	private String source;
	
	/**
	 * Whether this is the default/sticky image or not
	 */
	@XmlElement(name="default")
	private boolean sticky;
	
	/**
	 * Image URL
	 */
	private String url;
	
	/**
	 * Image width in pixels
	 */
	private int width;
	
	/**
	 * Image height in pixels
	 */
	private int height;
		
	/**
	 * Small image 
	 */
	private ImageItem small;
	
	/**
	 * Medium image
	 */
	private ImageItem medium;
	
	/**
	 * Large image
	 */
	private ImageItem large;
	
	/**
	 * Block image
	 */
	private ImageItem block;
	
	/** 
	 * Thumb image
	 */
	private ImageItem thumb;
	
	/**
	 * Original image
	 */
	private ImageItem original;
	
	/**
	 * @return the block
	 */
	public ImageItem getBlock() {
		return block;
	}
	/**
	 * @param block the block to set
	 */
	public void setBlock(ImageItem block) {
		this.block = block;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}
	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the large
	 */
	public ImageItem getLarge() {
		return large;
	}
	/**
	 * @param large the large to set
	 */
	public void setLarge(ImageItem large) {
		this.large = large;
	}
	/**
	 * @return the medium
	 */
	public ImageItem getMedium() {
		return medium;
	}
	/**
	 * @param medium the medium to set
	 */
	public void setMedium(ImageItem medium) {
		this.medium = medium;
	}
	/**
	 * @return the original
	 */
	public ImageItem getOriginal() {
		return original;
	}
	/**
	 * @param original the original to set
	 */
	public void setOriginal(ImageItem original) {
		this.original = original;
	}
	/**
	 * @return the small
	 */
	public ImageItem getSmall() {
		return small;
	}
	/**
	 * @param small the small to set
	 */
	public void setSmall(ImageItem small) {
		this.small = small;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the sticky
	 */
	public boolean isSticky() {
		return sticky;
	}
	/**
	 * @param sticky the sticky to set
	 */
	public void setSticky(boolean sticky) {
		this.sticky = sticky;
	}
	/**
	 * @return the thumb
	 */
	public ImageItem getThumb() {
		return thumb;
	}
	/**
	 * @param thumb the thumb to set
	 */
	public void setThumb(ImageItem thumb) {
		this.thumb = thumb;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

}

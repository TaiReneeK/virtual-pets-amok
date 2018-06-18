package org.wecancodeit.demo;

public class Review 
{

	private long id;
	private String name;
	private String category;
	private String content;
	private String date;
	private String image;

	public Review(long id, String name, String image, String category, String content, String date) 
	{
		this.id = id;
		this.name = name;
		this.image = image;
		this.category = category;
		this.content = content;
		this.date = date;
	}

	public Long getId() 
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
	
	public String getImage()
	{
		return image;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getDate()
	{
		return date;
	}
}

package org.wecancodeit.courses;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

public class Course 
{

	private long id;
	private String name;
	private String description;

	public Course(long id, String name, String description) 
	{
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() 
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
}

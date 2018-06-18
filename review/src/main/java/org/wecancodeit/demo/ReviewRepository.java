package org.wecancodeit.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository 
{

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository()
	{
		Review theHappening = new Review(1L, "The Happening", "/images/happening.jpg", "Comedy", 
				"Literally the worst movie I've ever seen. Save yourself time.", "6/17/18");
		
		Review inception = new Review(2L, "Inception", "/images/inception.jpg", "Thriller", 
				"Of course this is one of my favorite movies. Christopher Nolan rarely disappoints.", "6/17/18");
		
		Review daysOfSummer = new Review(3L, "500 Days Of Summer", "/images/dos.jpg", "Romance", 
				"I'm not normally one for romantic-comedies...who am I kidding? This was my favorite of the genre!", "6/17/18");
		
		reviewList.put(theHappening.getId(), theHappening);
		reviewList.put(inception.getId(), inception);
		reviewList.put(daysOfSummer.getId(), daysOfSummer);
	}
	public ReviewRepository(Review...reviews) 
	{
		for(Review review: reviews)
		{
		reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) 
	{
		return reviewList .get(id);
	}

	public Collection<Review> findAll() 
	{
		return reviewList.values();
	}

}

package org.wecancodeit.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewsRepositoryTest 
{
	ReviewRepository underTest;
	
	private long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "movie name", "movie image", "movie category", "movie description", "date");

	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "movie name", "movie image", "movie category", "movie description", "date");

	@Test
	public void shouldFindAReview()
	{
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}
	
	@Test
	public void shouldFindASecondReview()
	{
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}
	
	@Test
	public void shouldFindAllReviews()
	{
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
}

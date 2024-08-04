package com.microservice.rating.service;

import java.util.List;

import com.microservice.rating.entity.Rating;

public interface RatingService {

	//create 
	Rating create(Rating rating);
	
	//get all rating
	List<Rating> getAllRating();
	
	//get all by userId
	List<Rating> getAllRatingByUserId(String userId);
	
	//get all ny hotelId
	List<Rating> getAllRatingByHotelId(String hotelId);
}

package com.microservice.rating.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.rating.entity.Rating;
import com.microservice.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {

		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {

		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getAllRatingByUserId(String userId) {

		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getAllRatingByHotelId(String hotelId) {

		return ratingRepository.findByHotelId(hotelId);
	}

}

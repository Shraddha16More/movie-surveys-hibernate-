package com.runner;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Movie;
import com.model.Review;
import com.model.User;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//      Step 1 ----insert user---
//		User user1=new User(0, "Pranav", "pranav@gmail.com", "pranav@123");
//		User user2=new User(0, "Radha", "radha@gmail.com", "radha@123");
//		User user3=new User(0, "Nik", "nik@gmail.com", "nik@123");
//		
//		session.save(user1);
//		session.save(user2);
//		session.save(user3);
		
//		step 2 ---insert reviews---
//		User user=new User();
//		user.setUserId(12);
//		Movie movie=new Movie();
//		movie.setMovieId(10);
//		Review review1=new Review(0, "Nice film!!", user, movie);
//	
//		session.save(review1);
		
//		----fetch all reviews---
		Query query = session.createQuery("from reviews");
		List<Review> reviews = query.list();
		
		for(Review review: reviews )
		{
			System.out.println(review);
			System.out.println(review.getUser());
			System.out.println(review.getMovie());
		}

		
		transaction.commit();
		session.close();
		

	}

}

package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Wonder Woman");
		System.out.println(Arrays.toString(result));
	}

}

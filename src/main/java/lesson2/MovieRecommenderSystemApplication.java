package lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
       RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
       String[] result = recommender.recommendedMovies("Finding Dory");
       System.out.println(Arrays.toString(result));
    }

}

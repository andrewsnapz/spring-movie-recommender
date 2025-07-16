package lesson1;

public class RecommenderImplementation {
    public String[] recommendedMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}

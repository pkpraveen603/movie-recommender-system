package io.datajek.spring.basics.movierecommendersystem;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie){
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Wonder Woman");
        return results;
    }

}

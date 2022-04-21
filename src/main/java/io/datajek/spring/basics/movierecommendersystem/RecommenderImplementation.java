package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {


    private Filter filter;

    @Autowired
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){
        //ContentBasedFilter filter = new ContentBasedFilter();
        System.out.println("Name of filter in use: "+filter+".\n");
        String[] results = filter.getRecommendations("Wonder Woman");
        return results;
    }

}

package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {


//    private Filter filter;
//
//
//    public RecommenderImplementation(Filter filter){
//        super();
//        this.filter = filter;
//    }

    @Autowired
    private Filter collaborativeFilter;

    public String[] recommendMovies(String movie){
        //ContentBasedFilter filter = new ContentBasedFilter();
        System.out.println("Name of filter in use: "+collaborativeFilter+".\n");
        String[] results = collaborativeFilter.getRecommendations("Wonder Woman");
        return results;
    }

}

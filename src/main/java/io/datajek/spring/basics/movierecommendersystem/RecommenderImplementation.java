package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {


    @Autowired
    @Qualifier("CBF")
    private Filter filter;


//    public RecommenderImplementation(Filter filter){
//        super();
//        this.filter = filter;
//    }

//    @Autowired
//    private Filter collaborativeFilter;

    public String[] recommendMovies(String movie){
        //ContentBasedFilter filter = new ContentBasedFilter();
        System.out.println("Name of filter in use: "+filter+".\n");
        String[] results = filter.getRecommendations("Wonder Woman");
        return results;
    }

}

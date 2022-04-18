package io.datajek.spring.basics.movierecommendersystem;

public class ContentBasedFilter {
    public String[] getRecommendations(String movie){
        return new String[] {"Superman", "Batman", "Justice League"};
    }
}

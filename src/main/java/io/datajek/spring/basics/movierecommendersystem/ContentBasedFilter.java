package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[] {"Superman", "Batman", "Justice League"};
    }
}

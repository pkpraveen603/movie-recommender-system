package io.datajek.spring.basics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// alternatively can use @Component("CBF") as well
@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[] {"Superman", "Batman", "Justice League"};
    }
}

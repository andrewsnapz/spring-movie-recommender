package lesson8;

import org.springframework.stereotype.Component;

@Component("CBF")
// @Qualifier("CBF") either one will work
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}

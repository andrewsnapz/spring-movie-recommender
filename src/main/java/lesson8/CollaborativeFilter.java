package lesson8;

//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Option 1
@Scope("prototype")

// Option 2
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}

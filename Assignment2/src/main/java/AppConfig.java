import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="cll")
    public CollectionInterface getService()
    {
        return new Collection();

    }

}

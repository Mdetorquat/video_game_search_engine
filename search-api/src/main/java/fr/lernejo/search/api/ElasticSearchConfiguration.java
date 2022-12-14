package fr.lernejo.search.api;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfiguration {

    @Bean
    public RestHighLevelClient restHighLevelClient(@Value("${elasticsearch.host:localhost}") String host,
                                                   @Value("${elasticsearch.port:9200}") int port,
                                                   @Value("${elasticsearch.username:elastic}") String username,
                                                   @Value("${elasticsearch.password:admin}") String password) {
        // TODO
        return null;
    }
}

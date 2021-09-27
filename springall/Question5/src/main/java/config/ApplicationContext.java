package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
@ComponentScan(value = "com.capgemini.springmvc")
public class ApplicationContext extends AbstractMongoConfiguration
{

    @Override
    public String getDatabaseName()
    {
        return "admin";
    }

    @Override
    @Bean
    public MongoClient mongo() throws Exception
    {
        return new MongoClient("localhost", 27017);
    }

    @Override
    protected String getMappingBasePackage()
    {
        return "com.capgemini.springmvc.entity";
    }
}

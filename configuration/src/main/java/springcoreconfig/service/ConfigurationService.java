package springcoreconfig.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import springcoreconfig.dto.DbConfigurationInjectingProperties;
import springcoreconfig.dto.DbConfigurationUsingConfigurationProperties;
import springcoreconfig.dto.DbConfigurationUsingCoreEnvironment;

@Service
// generates a constructor for fields that are either final fields (immutable, must be initialized
// in the constructor),
// or annotated with @NonNull (Lombok forces these to be initialized).
@RequiredArgsConstructor
public class ConfigurationService {

  // Injected
  private final Environment environment;

  // Injected
  private final DbConfigurationUsingConfigurationProperties
      dbConfigurationUsingConfigurationProperties;
  
  // Injected
  private final DbConfigurationInjectingProperties dbConfigurationInjectingProperties;

  // simple POJO, app context is unaware of its existence
  private DbConfigurationUsingCoreEnvironment dbConfigurationUsingCoreEnvironment;

  @PostConstruct // Sets to run after dependency injection is done, but before the bean is used.
  private void setDefaultProfiles() {

    // Builder Pattern
    dbConfigurationUsingCoreEnvironment =
        DbConfigurationUsingCoreEnvironment.builder()
            .url(environment.getProperty("db.url"))
            .username(environment.getProperty("db.username"))
            .password(environment.getProperty("db.password"))
            .driver(environment.getProperty("db.driver"))
            .build();
  }

  public void printDbConfigurationUsingCoreEnvironment() {
    System.out.println(dbConfigurationUsingCoreEnvironment);
  }

  public void printDbConfigurationUsingConfigurationProperties() {
    System.out.println(dbConfigurationUsingConfigurationProperties);
  }

  public void printDbConfigurationInjectingProperties() {
    System.out.println(dbConfigurationInjectingProperties);
    
  }
}

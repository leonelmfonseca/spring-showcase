package springcoreconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springcoreconfig.service.ConfigurationService;

@SpringBootApplication
public class SpringCoreConfigApp {

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(SpringCoreConfigApp.class, args);
    ConfigurationService configurationService = context.getBean(ConfigurationService.class);
    System.out.println();
    configurationService.printDbConfigurationUsingCoreEnvironment();
    configurationService.printDbConfigurationUsingConfigurationProperties();
    configurationService.printDbConfigurationInjectingProperties();
  }
}

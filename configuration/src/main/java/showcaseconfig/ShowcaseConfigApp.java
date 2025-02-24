package showcaseconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import showcaseconfig.service.ConfigurationService;

@SpringBootApplication
public class ShowcaseConfigApp {

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(ShowcaseConfigApp.class, args);
    ConfigurationService configurationService = context.getBean(ConfigurationService.class);
    System.out.println();
    configurationService.printDbConfigurationUsingCoreEnvironment();
    configurationService.printDbConfigurationUsingConfigurationProperties();
    configurationService.printDbConfigurationInjectingProperties();
  }
}

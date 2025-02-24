package springcoreconfig.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "db")
@Component
@Data
@ToString
public class DbConfigurationUsingConfigurationProperties {

  private String url;
  private String username;
  private String password;
  private String driver;
}

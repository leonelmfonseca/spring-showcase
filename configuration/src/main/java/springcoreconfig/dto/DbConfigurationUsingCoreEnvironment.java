package springcoreconfig.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
public class DbConfigurationUsingCoreEnvironment {
  
  private String url;
  private String username;
  private String password;
  private String driver;
  
  
  
}

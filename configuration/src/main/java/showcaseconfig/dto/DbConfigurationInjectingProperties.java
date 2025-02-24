package showcaseconfig.dto;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
public class DbConfigurationInjectingProperties {
  
  @Value( "${db.url}" )
  private String url;
  @Value( "${db.username}" )
  private String username;
  @Value( "${db.password}" )
  private String password;
  @Value( "${db.driver}" )
  private String driver;
}

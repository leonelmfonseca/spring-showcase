package beanscopes;

/*
When we define a bean with the singleton scope, the container creates a single instance of that bean.
All requests for that bean name will return the same object, which is cached.
Any modifications to the object will be reflected in all references to the bean.
This scope is the default value if no other scope is specified.
*/

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Tiger {
  private String name;
  private String species;
  private Integer age;
  private Double weight;
  private Double height;
}

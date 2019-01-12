package ch.mare.springfundamentals.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    SingletonComponent singletonComponent1 = ctx.getBean(SingletonComponent.class);
    SingletonComponent singletonComponent2 = ctx.getBean(SingletonComponent.class);

    System.out.println(singletonComponent1.toString());
    System.out.println(singletonComponent2.toString());

    PrototypeComponent prototypeComponent1 = ctx.getBean(PrototypeComponent.class);
    PrototypeComponent prototypeComponent2 = ctx.getBean(PrototypeComponent.class);

    System.out.println(prototypeComponent1.toString());
    System.out.println(prototypeComponent2.toString());


  }
}

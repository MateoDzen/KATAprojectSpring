import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean2.getMessage());
        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        System.out.println(cat1.getMessage());
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);
        System.out.println(cat2.getMessage());
        System.out.println("Равны ли объекты класса HelloWorld? " + (bean == bean2));
        System.out.println("Равны ли объекты класса Cat? " + (cat1 == cat2));

    }
}
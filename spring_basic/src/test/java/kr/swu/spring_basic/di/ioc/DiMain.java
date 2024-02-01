package kr.swu.spring_basic.di.ioc;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Singer singer = (Singer)context.getBean("singer");
        singer.sing();
    }
}

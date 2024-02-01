package kr.swu.spring_basic.di.ioc;


import kr.swu.spring_basic.SpringBasicApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringBasicApplication.class)
public class ApplicationConfig {

}

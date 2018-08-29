package itsol.intership02;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"itsol.intership02"})
@EntityScan(basePackages = {"itsol.intership02"})
@ComponentScan(basePackages = {"itsol.intership02"})
public class QLDuAn {
    public static void main(String[] args){

        SpringApplication.run(QLDuAn.class,args);
    }

}

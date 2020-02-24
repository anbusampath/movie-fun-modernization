package org.superbiz.moviefun.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude= {io.pivotal.spring.cloud.IssuerCheckConfiguration.class})
public class MovieServiceApplication {
    public static void main(String... args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }
}

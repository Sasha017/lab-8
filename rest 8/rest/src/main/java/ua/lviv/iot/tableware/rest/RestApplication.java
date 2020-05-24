  
package ua.lviv.iot.tableware.rest;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.tableware.rest.dataaccess", "ua.lviv.iot.tableware.rest.business",
       "ua.lviv.iot.tableware.rest.controller" })
@EnableJpaRepositories("ua.lviv.iot.tableware.rest.dataaccess")
public class RestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
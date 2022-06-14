package com.hostetler.mike;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by mikeh on 7/15/16.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);

        NumberManager manager = (NumberManager) context.getBean("numberManager");

        System.out.println(manager.findResult());


    }

}

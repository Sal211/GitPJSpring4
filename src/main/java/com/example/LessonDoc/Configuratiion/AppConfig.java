package com.example.LessonDoc.Configuratiion;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public String  myService(ApplicationArguments args) {
        // Access application arguments
        if (args.containsOption("debug")) {
            System.out.println("Debug mode enabled");
        }

        return "";
    }
}

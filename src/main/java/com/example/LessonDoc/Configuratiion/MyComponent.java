package com.example.LessonDoc.Configuratiion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class MyComponent {
    @Autowired
    private ApplicationArguments arg;

    public void checkArguments() {
        // Access application arguments
        if (arg.containsOption("profile")) {
            System.out.println("Profile mode enabled");
        }
    }
}

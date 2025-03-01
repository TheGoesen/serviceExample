package org.example.app;

import java.util.ServiceLoader;
import org.example.Library;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Library> load = ServiceLoader.load(Library.class);
        boolean b = load.findFirst()
                .orElseThrow(()-> new RuntimeException("I didnt find a LibImplementation"))
                .someLibraryMethod();
        System.out.println("The Result is: " + b);
    }
}

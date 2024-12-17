package com.example.annotation;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    static class Main {
        public static void main(String[] args) throws Exception {
            Person person = new Person(25); // Valid
            ValueValidator.validate(person);
            Person invalidPerson = new Person(-5); // Invalid
            ValueValidator.validate(invalidPerson);
        }
    }

}

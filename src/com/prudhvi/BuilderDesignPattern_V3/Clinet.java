package com.prudhvi.BuilderDesignPattern_V3;


public class Clinet {
    public static void main(String[] args) {
        /**
         * this is the best way to of the " Builder Design Pattern "implementation"
         * In this we are usig the Streams topic in the setter method to return the value
         * here we switched the validation in the Builder class only so that no need to create the dummy builder object when validation gets failed
         *
         */
        User user = new BuilderUser()
                .setFirstName("Bavigadda")
                .setLastName("Prudviraj")
                .setAge(23)
                .setPhone("12345678")
                .setAddress("Adoni")
                .build();

        System.out.println(user);
    }
}

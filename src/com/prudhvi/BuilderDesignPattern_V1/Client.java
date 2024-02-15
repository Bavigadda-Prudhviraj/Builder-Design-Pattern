package com.prudhvi.BuilderDesignPattern_V1;

public class Client {
    public static void main(String[] args) {
        BuilderUser builderUser = new BuilderUser();
        //Setting up all the parameter
        //if we pass null values for the setter of first and last names it will throw an exception
        //Because we are validating the user constructor
        builderUser.setFirstName("Bavigadda");
        builderUser.setLastName("Prudhviraj");
        builderUser.setAge(23);
        builderUser.setPhone("123456789");
        builderUser.setAddress("Adoni");

        //we are passing the builder object to the  User constructor
        User user = new User(builderUser);
        System.out.println(user);
        /**
         * @note:- 1.Main disadvantage of the version one is here  we are creating the two. again we are setting up the values
         *         2.In Version 2(V2) we are going to use the build method which give the build object of the student directly
         *

         */



    }
}

package com.prudhvi.BuilderDesignPattern_V2;




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
        /**
         * her we are not creating the object of the User we are calling the static build method which helps us to gives the User object
         */
        User user = builderUser.build(builderUser);
    }




}

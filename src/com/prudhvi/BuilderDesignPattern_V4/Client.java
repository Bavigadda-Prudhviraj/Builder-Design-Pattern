package com.prudhvi.BuilderDesignPattern_V4;



public class Client {
    public static void main(String[] args) {
        User user = new User
                .BuilderUser() //As we declared the Builder clas as static we can access the the methods of the static with the clas name only
                .setFirstName("bavigadda")
                .setLastName("Prudhvi raj")
                .setAge(23)
                .setPhone("123456789")
                .setAddress("adoni").build();
        System.out.println(user);
    }
}

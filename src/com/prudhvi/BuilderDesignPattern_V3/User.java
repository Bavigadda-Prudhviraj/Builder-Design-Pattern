package com.prudhvi.BuilderDesignPattern_V3;


public class User {
    //All final attributes
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    public User(BuilderUser builderUser){
        this.firstName = builderUser.getFirstName();
        this.lastName = builderUser.getLastName();
        this.age = builderUser.getAge();
        this.phone = builderUser.getPhone();
        this.address = builderUser.getAddress();;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

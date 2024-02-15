package com.prudhvi.BuilderDesignPattern_V2;

public class User {
    //All final attributes
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    public User(BuilderUser builderUser){
        //here we are validating the data which is coming from the Builder object we can optimize more in V3 and V4
        if(builderUser.getFirstName() == null)
            throw new IllegalArgumentException("please give the fist name it is required to proceed");
        if(builderUser.getLastName() == null)
            throw new IllegalArgumentException("please give the last name it is required to proceed");
        if(builderUser.getAge() < 0 || builderUser.getAge() > 100)
            throw  new IllegalArgumentException("please enter the age within valid range in between 0 to 100 ");

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

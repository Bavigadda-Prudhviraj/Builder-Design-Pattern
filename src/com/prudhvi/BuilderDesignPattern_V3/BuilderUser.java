package com.prudhvi.BuilderDesignPattern_V3;


public class BuilderUser {
    //All attributes
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    // To understand the return type go through the Streams topics once
    public BuilderUser setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public BuilderUser setAge(int age) {
        this.age = age;
        return this;
    }
    public BuilderUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public BuilderUser setAddress(String address) {
        this.address = address;
        return this;
    }
    public BuilderUser setFirstName(String firstName) {
        this.firstName = firstName;
        return  this;
    }

    /**Here no need make it as static as we made in v2 version
     * If the parameter validation got failed then it won't create the object of any class
     * so, we can say we optimized here compared to the version 2
     * Also we are using the Streams in the setter method so that it makes esy to crete the object of the builder object.
     * @return
     */
    public User build(){
        //here we are validating the data which is coming from the Builder object we can optimize more in V3 and V4
        if(this.getFirstName() == null)
            throw new IllegalArgumentException("please give the fist name it is required to proceed");
        if(this.getLastName() == null)
            throw new IllegalArgumentException("please give the last name it is required to proceed");
        if(this.getAge() < 0 || this.getAge() > 100)
            throw  new IllegalArgumentException("please enter the age within valid range in between 0 to 100 ");
        return  new User(this);
    }




}

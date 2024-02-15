package com.prudhvi.BuilderDesignPattern_V4;


public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    /**
     * here we are making this user constructor as private so that client can have access to create the object of tha main user directly
     * @param builderUser
     */
     private User(BuilderUser builderUser) {
        this.firstName = builderUser.getFirstName();
        this.lastName = builderUser.getLastName();
        this.age = builderUser.getAge();
        this.phone = builderUser.getPhone();
        this.address = builderUser.getAddress();
        ;
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

    /**
     * here we are making this class as static
     * so that we call the build method directly without creating object of this class.
     */
    public static class BuilderUser {
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
            return this;
        }

        public User build() {
            //here we are validating the data which is coming from the Builder object we can optimize more in V3 and V4
            if (this.getFirstName() == null)
                throw new IllegalArgumentException("please give the fist name it is required to proceed");
            if (this.getLastName() == null)
                throw new IllegalArgumentException("please give the last name it is required to proceed");
            if (this.getAge() < 0 || this.getAge() > 100)
                throw new IllegalArgumentException("please enter the age within valid range in between 0 to 100 ");

            return new User(this);
        }
    }

}

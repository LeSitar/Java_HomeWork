package de.telran.model;

public class User {
    String firstName;
    String lastName;

    Address address;

    Phone[] phones;

    public User(){}

    public User(String firstName, String lastName, Address address, Phone[] phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phones = phones;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }

   public String toStringPhones(Phone[] phones){
        StringBuffer temp = new StringBuffer();
        for(Phone phone : phones){
            temp.append(phone.toString() + "/ ");
        }
       return temp.toString();
   }

    @Override
    public String toString() {
        return "User"+
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''  + " " + address + " " + toStringPhones(phones);
    }
}


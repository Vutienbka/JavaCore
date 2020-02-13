package SOLID_eCommer;

import java.util.Date;

public class Customers {
    private String customerID;
    private String name;
    private String email;
    private String address;
    private String password;
    private String phone;
    private Date dateTime;
    private Boolean status = false;

    public Customers() {
    }

    public Customers(String customerID, String name, String email, String address, String password, String phone, Date dateTime, Boolean status) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.dateTime = dateTime;
        this.status = status;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Boolean registry(String customerID, String name, String email, String address, String phone, Date dateTime){
        return true;
    }
}

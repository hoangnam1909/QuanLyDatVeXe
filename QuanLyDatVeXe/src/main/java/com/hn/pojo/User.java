package com.hn.pojo;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "account", schema = "quanlydatvexe", catalog = "")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public static final String ADMIN = "ADMIN";
    public static final String STAFF = "STAFF";
    public static final String DRIVER = "DRIVER";

    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "avatar")
    private String avatar;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "fullname")
    private String fullname;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "gender")
    private Byte gender;
    @Basic
    @Column(name = "user_role")
    private String userRole;
    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Customer> customersById;
    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Driver> driversById;
    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Staff> staffById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (avatar != null ? !avatar.equals(user.avatar) : user.avatar != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (fullname != null ? !fullname.equals(user.fullname) : user.fullname != null) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        if (userRole != null ? !userRole.equals(user.userRole) : user.userRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        return result;
    }

    public Collection<Customer> getCustomersById() {
        return customersById;
    }

    public void setCustomersById(Collection<Customer> customersById) {
        this.customersById = customersById;
    }

    public Collection<Driver> getDriversById() {
        return driversById;
    }

    public void setDriversById(Collection<Driver> driversById) {
        this.driversById = driversById;
    }

    public Collection<Staff> getStaffById() {
        return staffById;
    }

    public void setStaffById(Collection<Staff> staffById) {
        this.staffById = staffById;
    }
}

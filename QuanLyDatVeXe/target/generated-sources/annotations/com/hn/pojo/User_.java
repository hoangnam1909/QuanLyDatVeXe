package com.hn.pojo;

import com.hn.pojo.Customer;
import com.hn.pojo.Driver;
import com.hn.pojo.Staff;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-23T21:59:46")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, Byte> gender;
    public static volatile CollectionAttribute<User, Driver> driversById;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile CollectionAttribute<User, Customer> customersById;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> fullname;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile CollectionAttribute<User, Staff> staffById;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}
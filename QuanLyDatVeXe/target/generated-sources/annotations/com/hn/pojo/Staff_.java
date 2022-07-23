package com.hn.pojo;

import com.hn.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-23T21:59:46")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, User> accountByAccountId;
    public static volatile SingularAttribute<Staff, Integer> accountId;
    public static volatile SingularAttribute<Staff, Integer> departmentId;
    public static volatile SingularAttribute<Staff, Integer> id;
    public static volatile SingularAttribute<Staff, String> position;

}
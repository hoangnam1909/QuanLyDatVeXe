package com.hn.pojo;

import javax.persistence.*;

@Entity
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "account_id")
    private int accountId;
    @Basic
    @Column(name = "department_id")
    private int departmentId;
    @Basic
    @Column(name = "position")
    private String position;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private User accountByAccountId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (id != staff.id) return false;
        if (accountId != staff.accountId) return false;
        if (departmentId != staff.departmentId) return false;
        if (position != null ? !position.equals(staff.position) : staff.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + accountId;
        result = 31 * result + departmentId;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    public User getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(User accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }
}

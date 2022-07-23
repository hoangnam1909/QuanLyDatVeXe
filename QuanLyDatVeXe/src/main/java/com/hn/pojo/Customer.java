package com.hn.pojo;

import javax.persistence.*;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "account_id")
    private int accountId;
    @Basic
    @Column(name = "cmnd")
    private String cmnd;
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

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (accountId != customer.accountId) return false;
        if (cmnd != null ? !cmnd.equals(customer.cmnd) : customer.cmnd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + accountId;
        result = 31 * result + (cmnd != null ? cmnd.hashCode() : 0);
        return result;
    }

    public User getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(User accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }
}

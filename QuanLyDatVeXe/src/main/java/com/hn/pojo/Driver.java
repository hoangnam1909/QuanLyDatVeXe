package com.hn.pojo;

import javax.persistence.*;

@Entity
public class Driver {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "account_id")
    private int accountId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (id != driver.id) return false;
        if (accountId != driver.accountId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + accountId;
        return result;
    }

    public User getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(User accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }
}

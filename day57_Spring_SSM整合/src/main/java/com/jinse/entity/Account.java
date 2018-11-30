package com.jinse.entity;

public class Account {
    private Integer accountId;
    private Integer uid;
    private Double money;

    public Account(Integer accountId, Integer uid, Double money) {
        this.accountId = accountId;
        this.uid = uid;
        this.money = money;
    }

    public Account() {
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}

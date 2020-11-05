package com.meiit.webalk.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BookingPerson extends User{
    private String name;
    private Integer accountnumber;
    private BigDecimal balance;
    private LocalDate birth;
    //Private
    Currency currency;
    //Why? Inheritence? delete pls
    User u;

    public BookingPerson(String n, Integer an,BigDecimal ballance, LocalDate birth,Currency c) {
        super();
        this.name=n;
        this.accountnumber=an;
        this.balance=ballance;
        this.birth=birth;
        this.currency =c;
    }

    public BookingPerson() {
        super();
        this.name=n;
        this.balance=mon;
        this.currency=curr;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAccount() {
        return accountnumber;
    }
    public void setAccount(Integer account) {
        this.accountnumber = account;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

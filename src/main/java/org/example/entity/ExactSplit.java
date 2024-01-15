package org.example.entity;

public class ExactSplit extends Split{
    double amount;
    public ExactSplit(User user, double amount) {
        super(user);
        this.amount=amount;
    }
}

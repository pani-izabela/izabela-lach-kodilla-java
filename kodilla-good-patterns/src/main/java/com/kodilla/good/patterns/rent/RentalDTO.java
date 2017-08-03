package com.kodilla.good.patterns.rent;

public class RentalDTO {
    public User user;
    public boolean isRented;

    public RentalDTO(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser(){return user;}

    public boolean isRented(){return isRented;}
}

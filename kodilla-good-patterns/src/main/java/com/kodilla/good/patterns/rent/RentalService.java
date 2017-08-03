package com.kodilla.good.patterns.rent;


import java.time.LocalDateTime;

public interface RentalService {
    public boolean rent(User user, LocalDateTime from, LocalDateTime to);
}

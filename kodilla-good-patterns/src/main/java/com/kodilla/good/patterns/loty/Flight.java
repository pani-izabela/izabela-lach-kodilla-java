package com.kodilla.good.patterns.loty;

import java.time.LocalDateTime;

public class Flight {
    private String nameFlight;
    private String departureTown;
    private String arrivalTown;
    private LocalDateTime dateDeparture;

    public Flight(String nameFlight, String departureTown, String arrivalTown, LocalDateTime dateDeparture) {
        this.nameFlight = nameFlight;
        this.departureTown = departureTown;
        this.arrivalTown = arrivalTown;
        this.dateDeparture = dateDeparture;
    }

    public String getNameFlight() {
        return nameFlight;
    }

    public String getDepartureTown() {
        return departureTown;
    }

    public String getArrivalTown() {
        return arrivalTown;
    }

    public LocalDateTime getDateDeparture() {
        return dateDeparture;
    }

    @Override
    public String toString() {
        return nameFlight +
                "/ Wylot z miasta: " + departureTown +
                "/ Przylot do miasta: " + arrivalTown +
                "/ Data i godzina wylotu: " + dateDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!nameFlight.equals(flight.nameFlight)) return false;
        if (!departureTown.equals(flight.departureTown)) return false;
        if (!arrivalTown.equals(flight.arrivalTown)) return false;
        return dateDeparture.equals(flight.dateDeparture);
    }

    @Override
    public int hashCode() {
        int result = nameFlight.hashCode();
        result = 31 * result + departureTown.hashCode();
        result = 31 * result + arrivalTown.hashCode();
        result = 31 * result + dateDeparture.hashCode();
        return result;
    }
}

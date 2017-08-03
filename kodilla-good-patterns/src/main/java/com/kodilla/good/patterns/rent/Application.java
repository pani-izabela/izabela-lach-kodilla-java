package com.kodilla.good.patterns.rent;

public class Application {
    RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
    RentRequest rentRequest = rentRequestRetriever.retrieve();

    RentalProcessor rentalProcessor = new RentalProcessor(new MailService(), new CarRentalService(), new CarRentalRepository());
    rentalProcessor.process(rentRequest);
}

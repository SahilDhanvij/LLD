package lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

import lld.parkinglot.Strategies.CashPayment;
import lld.parkinglot.Strategies.Computation;
import lld.parkinglot.Strategies.EntranceGate;
import lld.parkinglot.Strategies.ExitGate;
import lld.parkinglot.Strategies.FourWheelerManager;
import lld.parkinglot.Strategies.HourlyPrice;
import lld.parkinglot.Strategies.NearestParkingStrategy;
import lld.parkinglot.Strategies.ParkingManager;
import lld.parkinglot.Strategies.Payment;
import lld.parkinglot.Strategies.PriceStrategy;
import lld.parkinglot.Strategies.TwoWheelerManager;
import lld.parkinglot.Strategies.UPIPayment;
import lld.parkinglot.Strategies.parkingStrategy;
import lld.parkinglot.models.FourWheelerSpot;
import lld.parkinglot.models.ParkingSpot;
import lld.parkinglot.models.Ticket;
import lld.parkinglot.models.TwoWheelerSpot;
import lld.parkinglot.models.Vehicle;
import lld.parkinglot.models.VehicleType;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();

        parkingSpots.add(new TwoWheelerSpot(1));
        parkingSpots.add(new TwoWheelerSpot(2));
        parkingSpots.add(new TwoWheelerSpot(3));
        parkingSpots.add(new TwoWheelerSpot(4));
        parkingSpots.add(new TwoWheelerSpot(5));

        parkingSpots.add(new FourWheelerSpot(1));
        parkingSpots.add(new FourWheelerSpot(2));
        parkingSpots.add(new FourWheelerSpot(3));

        parkingStrategy nearestStrategy = new NearestParkingStrategy();
        ParkingManager twoWheelerManager = new TwoWheelerManager(parkingSpots, nearestStrategy);
        ParkingManager fourWheelerManager = new FourWheelerManager(parkingSpots, nearestStrategy);
        EntranceGate entranceGate = new EntranceGate(twoWheelerManager);
        EntranceGate entranceGate2 = new EntranceGate(fourWheelerManager);
        PriceStrategy priceStrategy = new HourlyPrice();
        Computation computation = new Computation(priceStrategy);
        Payment cashpayment = new CashPayment();
        Payment upipayment = new UPIPayment();
        ExitGate exitGate = new ExitGate(fourWheelerManager, computation, cashpayment);
        ExitGate exitGate2 = new ExitGate(twoWheelerManager, computation, upipayment);

        Vehicle vehicle1 = new Vehicle(
            "KA-01-1234",
            VehicleType.TWO_WHEELER
        );  
        Vehicle vehicle2 = new Vehicle(
            "KA-01-1234",
            VehicleType.TWO_WHEELER
        ); 
        Vehicle vehicle3 = new Vehicle(
            "KA-01-1234",
            VehicleType.FOUR_WHEELER
        ); 
        Vehicle vehicle4 = new Vehicle(
            "KA-01-1234",
            VehicleType.FOUR_WHEELER
        ); 
        
        Ticket ticket1 = entranceGate.parkVehicle(vehicle1);
        Ticket ticket2 = entranceGate.parkVehicle(vehicle2);
        Ticket ticket3 = entranceGate2.parkVehicle(vehicle3);
        Ticket ticket4 = entranceGate2.parkVehicle(vehicle4);

        System.out.println("Vehicle parked successfully!");

        exitGate.exitVehicle(ticket1);
        exitGate.exitVehicle(ticket2);
        exitGate2.exitVehicle(ticket3);
        exitGate2.exitVehicle(ticket4);
        

        System.out.println("Vehicle exited successfully!");

    }



}

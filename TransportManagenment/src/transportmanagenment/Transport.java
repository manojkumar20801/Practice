/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportmanagenment;

/**
 *
 * @author Manoj
 */
public class Transport 
{
    int passengerId;
    String passengerName;
    String fromCity;
    String toCity;
    double distance;
    double fare;
    
    
    Transport( int passengerId,String passengerName,String fromCity,String toCity,double distance,double fare;)
    {
    this.passengerId=passengerId;
    this.passengerName=passengerName;
    this.fromCity=fromCity;
    this.toCity=toCity;
    this.distance=distance;
    this.fare=fare;
    }
    abstract void calculateFare()
    {
    void displayTicket()
    {
    System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Passenger ID   : " + passengerId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Route          : " + fromCity + " -> " + toCity);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : ₹" + fare);
    }    
    }
    
    
}

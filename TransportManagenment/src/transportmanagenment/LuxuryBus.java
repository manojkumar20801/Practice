
package transportmanagenment;


public class LuxuryBus extends Transport
{
  LuxuryBus(int passengerId, String passengerName,
              String fromCity, String toCity, double distance)
  {
  LuxuryBus(int passengerId, String passengerName,
              String fromCity, String toCity, double distance)
              {
               super(passengerId, passengerName,
              fromCity, toCity, distance);
    }
              void calculateFare()
              {
               fare = (distance * 10) + 200;   
              }
              
  }
}

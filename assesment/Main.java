package assesment;

public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.PILOT;

        CrewMember crewMember1 = new CrewMember("Jack", flightCrewJob1,100000.0f);
        CrewMember crewMember2 = new CrewMember("John", flightCrewJob2,90000.0f);
        CrewMember crewMember3 = new CrewMember("Jill", flightCrewJob3,70000.0f);


        Ticket planeTicket = new PlaneTicket(2,"Brooklyn","Germany","007A",100);
        Ticket busTicket = new BusTicket(3,"Washington DC","Alabama","B52",50);

        String [] passenger07Luggage = {"luggage 1", "luggage2"};
        String [] passenger57Luggage = {"luggage 3", "luggage4", "luggage5"};

        Passenger passenger07 = new Passenger("Wesley Snipes",planeTicket,800, passenger07Luggage);
        Passenger passenger57 = new Passenger("John Snow",busTicket,1000, passenger57Luggage);

        passenger07.printTicket();


    }
}

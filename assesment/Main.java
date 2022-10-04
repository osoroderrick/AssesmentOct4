package assesment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightApp flightApp = new FlightApp();
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;

        CrewMember crewMember1 = new CrewMember("Jack", flightCrewJob1,100000.0f);
        CrewMember crewMember2 = new CrewMember("John", flightCrewJob2,90000.0f);
        CrewMember crewMember3 = new CrewMember("Jill", flightCrewJob3,70000.0f);


        Ticket planeTicket = new PlaneTicket(2,"Brooklyn","Germany","007A",100);
        Ticket busTicket = new BusTicket(3,"Washington DC","Alabama","B52",50);

        String [] passenger07Luggage = {"luggage 1", "luggage2"};
        String [] passenger57Luggage = {"luggage 3", "luggage4", "luggage5"};

        Passenger passenger07 = new Passenger("John Snow",planeTicket,800, passenger07Luggage);
        Passenger passenger57 = new Passenger("Wesley Snipes",busTicket,1000, passenger57Luggage);

        PayAble [] payAbles = {crewMember1,crewMember2,crewMember3,planeTicket, busTicket};

        ArrayList<FlightCrewJob> flightCrewJobs = new ArrayList<>();
        flightCrewJobs.add(flightCrewJob3);
        flightCrewJobs.add(flightCrewJob1);
        flightCrewJobs.add(flightCrewJob2);

        //Get Amount of Luggage Method
        System.out.println("Amount of Luggage: " + passenger57.getAmtOfLuggage());

        //Print Ticket Method
        System.out.println("======================");
        passenger07.printTicket();

        //Serve Method
        System.out.println("======================");
        crewMember3.serve(passenger57);

        //Print Amount For Each Thing That is Payable
        System.out.println("======================");
        flightApp.printAmountForEachThingThatIsPayable(payAbles);

        //Print Each Flight Crew Job
        System.out.println("======================");
        flightApp.printEachFlightCrewJob(flightCrewJobs);

        //Invoke sortAndPrintFlightCrewJobsByJobTitle
        System.out.println("======================");
        flightApp.sortAndPrintFlightCrewMembersByJob(flightCrewJobs);


        //printAllFlightCrewJObsExceptThisCrewMemberJob method
        System.out.println("======================");
        flightApp.printAllJobsExceptThisCrewMemberJob(flightCrewJobs,crewMember3);
    }
}

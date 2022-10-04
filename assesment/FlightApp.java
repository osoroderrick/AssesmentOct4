package assesment;

import java.util.ArrayList;
import java.util.Comparator;

public class FlightApp {
    public void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs){
        for(FlightCrewJob currentJob : flightCrewJobs){
            System.out.println(currentJob.name());
        }
    }

    public void printAmountForEachThingThatIsPayable(PayAble[] payAbles){
        for(PayAble payable : payAbles){
            payable.printPaymentAmount();
        }
    }

    public void sortAndPrintFlightCrewMembersByJob(ArrayList<FlightCrewJob> flightCrewJobs){
        ArrayList<String> flightsCrewMembersByJob;
        for (FlightCrewJob flightCrewJob : flightCrewJobs){

        }
    }

    public void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs,CrewMember crewMember){

    }
}

package assesment;

import java.util.ArrayList;
import java.util.Collections;


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
        Collections.sort(flightCrewJobs);
        for (FlightCrewJob flightCrewJob: flightCrewJobs) {
            System.out.println(flightCrewJob);
        }
    }

    public void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs,CrewMember crewMember){
            flightCrewJobs.remove(crewMember.getJob());

        for (FlightCrewJob flightCrewJob : flightCrewJobs) {
            System.out.println(flightCrewJob);

        }
    }
}

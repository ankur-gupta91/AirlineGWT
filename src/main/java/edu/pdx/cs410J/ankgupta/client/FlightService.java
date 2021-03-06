package edu.pdx.cs410J.ankgupta.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import edu.pdx.cs410J.AbstractAirline;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A GWT remote service that returns a dummy airline
 */
@RemoteServiceRelativePath("flight")

public interface FlightService extends RemoteService {

    /**
     *
     * @param text airline name
     * @param flight flight object
     * @return Hashmap
     */
    public HashMap<String, Airline> addFlight(String text, Flight flight);

    /**
     *
     * @param name airline name
     * @param source flight source
     * @param dest flight destination
     * @return Hashmap
     */
    public HashMap<String, Airline> searchFlight(String name, String source, String dest);

    /**
     *
     * @return the Hashmap of airlines
     */
    public HashMap<String, Airline> Display();
}

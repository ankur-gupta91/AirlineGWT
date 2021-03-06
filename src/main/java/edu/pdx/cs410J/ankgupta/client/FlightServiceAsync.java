package edu.pdx.cs410J.ankgupta.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import edu.pdx.cs410J.AbstractAirline;

import java.util.HashMap;

/**
 * The client-side interface to the ping service
 */
public interface FlightServiceAsync {

    /**
     *
     * @param text airline name
     * @param flight flight object
     * @param async asynchronous call
     */
    void addFlight(String text, Flight flight, AsyncCallback<HashMap<String, Airline>> async);

    /**
     *
     * @param name airline name
     * @param source flight source
     * @param dest flight destination
     * @param async call back
     */
    void searchFlight(String name, String source, String dest, AsyncCallback<HashMap<String, Airline>> async);

    /**
     *
     * @param async so we can send hashmap
     */
    void Display(AsyncCallback<HashMap<String, Airline>> async);
}

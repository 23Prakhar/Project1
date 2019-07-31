package com.EventCreation.client;

import com.EventCreation.shared.Beans;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void EventCreation( Beans r, AsyncCallback<Beans> callback) throws IllegalArgumentException;
}

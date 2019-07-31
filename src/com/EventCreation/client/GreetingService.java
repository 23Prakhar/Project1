package com.EventCreation.client;

import com.EventCreation.shared.Beans;
//import com.EventCreation.shared.Regist;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	Beans EventCreation(Beans  r) throws IllegalArgumentException;
}

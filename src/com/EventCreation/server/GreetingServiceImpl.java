package com.EventCreation.server;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.EventCreation.client.GreetingService;
//import com.EventCreation.client.Regist;
import com.EventCreation.shared.Beans;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	Connection con=null;
	Statement st=null;
	
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");		
	}catch(ClassNotFoundException e)
		{
		}
	    try {
	    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
	        st=con.createStatement();
	    }catch (SQLException e) {
			// TODO: handle exception
		}
	}

	@Override
	public Beans EventCreation(Beans r) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String s1=r.getName();
		String s2=r.getVenue();
		String s3=r.getDate();
		String s4=r.getTime();
		
		try {
			st.executeUpdate("insert into event values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
		}catch(SQLException t)
		{
			System.out.println(t.getMessage());
		}
		return r;
	}

	

}
	

	

package com.EventCreation.client;

import com.EventCreation.*;
import com.EventCreation.shared.Beans;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

//import gwt.material.design.client.ui.MaterialButton;
//import gwt.material.design.client.ui.MaterialTextBox;

public class Fields extends Composite  {

	private static FieldsUiBinder uiBinder = GWT.create(FieldsUiBinder.class);

	interface FieldsUiBinder extends UiBinder<Widget, Fields> {
	}

	public Fields() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	@UiField
	MaterialTextBox nam;
	
	
	@UiField
	MaterialTextBox ven;
	
	@UiField
	MaterialTextBox date;
	
	@UiField
	MaterialTextBox time;

	@UiField
	MaterialButton b1;
	
	
	@UiHandler("b1")
	void onClick(ClickEvent e) {
		
		String s1=nam.getText();
		String s2=ven.getText();
		String s3=date.getText();
		String s4=time.getText();
	   Beans r=new Beans(); 
	    r.setName(s1);
	    r.setVenue(s2);
	    r.setDate(s3);
	    r.setTime(s4);
	  a1.EventCreation(r, new AsyncCallback<Beans>() {
		
		@Override
		public void onSuccess(Beans result) {
			// TODO Auto-generated method stub
			Window.alert("inserted yes!");
		}
		
		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			Window.alert("Not Inserted");
		}
	});   
}

	public void setText(String text) {
		b1.setText(text);
	}

	public String getText(String s1,String s2,String s3,String s4) {
		return b1.getText();
	}

	
	}

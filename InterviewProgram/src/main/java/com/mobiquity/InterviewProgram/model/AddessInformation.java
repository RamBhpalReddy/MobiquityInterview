package com.mobiquity.InterviewProgram.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddessInformation {
	private String street;
	private String housenumber;
	private String postalcode;
	private String city;
	private LocationInformation geoLocation;

}

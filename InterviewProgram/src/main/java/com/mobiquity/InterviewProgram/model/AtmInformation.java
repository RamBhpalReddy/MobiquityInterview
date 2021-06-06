package com.mobiquity.InterviewProgram.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AtmInformation {
	private AddessInformation address;
	private String distance;
	private OpeningHours openingHours;
	private String functionality;
	private String type;

}

package com.mobiquity.InterviewProgram.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpeningHours {
	private String dayOfWeek;
	private List<HoursInformation> hours;

}

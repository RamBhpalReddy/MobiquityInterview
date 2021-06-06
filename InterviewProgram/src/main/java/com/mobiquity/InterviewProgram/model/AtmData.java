package com.mobiquity.InterviewProgram.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AtmData {
	
	List<AtmInformation> atmsInfo;

}

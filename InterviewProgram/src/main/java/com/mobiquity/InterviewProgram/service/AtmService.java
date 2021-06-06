package com.mobiquity.InterviewProgram.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobiquity.InterviewProgram.model.AtmData;
import com.mobiquity.InterviewProgram.model.AtmInformation;

public class AtmService {

	@Autowired
	private AtmInfoService atmInfoService;

	public List<AtmInformation> getAllAtmInfo() {
		AtmData allAtmList = atmInfoService.getAtmInformation();
		return allAtmList.getAtmsInfo();
	}

	public List<AtmInformation> getAllAtmInfobyCity(String city) {
		List<AtmInformation> allAtmList = getAllAtmInfo();
		List<AtmInformation> allAtmListByCity = allAtmList.stream()
				.filter(atminfo -> atminfo.getAddress().getCity() == city).collect(Collectors.toList());
		return allAtmListByCity;

	}
}

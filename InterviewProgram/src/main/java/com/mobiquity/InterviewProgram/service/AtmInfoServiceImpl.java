package com.mobiquity.InterviewProgram.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mobiquity.InterviewProgram.model.AtmData;

@FeignClient(url = "https://www.ing.nl")
public interface AtmInfoServiceImpl extends AtmInfoService {

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/api/locator/atms/", consumes = "application/json", produces = "application/json")
	public AtmData getAtmInformation();

}

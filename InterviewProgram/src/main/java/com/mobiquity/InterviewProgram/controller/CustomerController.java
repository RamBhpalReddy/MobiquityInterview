package com.mobiquity.InterviewProgram.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.InterviewProgram.exception.DataException;
import com.mobiquity.InterviewProgram.model.AtmInformation;
import com.mobiquity.InterviewProgram.service.AtmService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/atm")
@Slf4j
public class CustomerController {
	
	@Autowired
	private AtmService atmService;
	

	@GetMapping("/getAllAtmInfo")
	public @ResponseBody List<AtmInformation> getAllAtmInfo() {
		List<AtmInformation> response = new ArrayList<>();
		try {
			response = atmService.getAllAtmInfo();
			log.info("getAllAtmInfo response: " + response);
		} catch (Exception e) {
			String errorMsg = String.format("Exception while fetching data. Caused by: {}, Error Msg: {}",
					e.getCause(), e.getMessage());
			log.error(errorMsg);
			throw new DataException(errorMsg);
		}
		return response;
	}

	@GetMapping("/getAtmInfoByCity")
	public @ResponseBody List<AtmInformation> getAtmInfoByCity(@RequestParam String city) {
		List<AtmInformation> response = new ArrayList<>();
		try {
			response = atmService.getAllAtmInfobyCity(city);
			log.info("getAtmInfoByCity response: " + response);
		} catch (Exception e) {
			String errorMsg = String.format("Exception while fetching data. Caused by: {}, Error Msg: {}",
					e.getCause(), e.getMessage());
			log.error(errorMsg);
			throw new DataException(errorMsg);
		}
		return response;
	}

}

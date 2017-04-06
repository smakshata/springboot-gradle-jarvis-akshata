package com.jarvis.apps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getConfigValue(@RequestParam String name) {
		return name + "=test";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody String getConfigValue() {
		return "empName=test";
	}
	
}

package info.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import info.example.service.TestService;


@Controller
@EnableAutoConfiguration
public class TestController {
	
	final static Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	public @ResponseBody String hello() throws Exception{
		return "Hello World!";
	}
	
	@RequestMapping("/now")
	public @ResponseBody String now() throws Exception{
		logger.debug("log debug : [TestController]: now() method is called");
		logger.info("log info   : [TestController]: now() method is called");
		logger.error("log error : [TestController]: now() method is called");
		logger.warn("log warn   : [TestController]: now() method is called");
		logger.trace("log trace : [TestController]: now() method is called");
		return testService.getDual();
	}
	
}

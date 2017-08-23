package com.itunic.kf.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itunic.kf.service.KfService;

@RestController
public class KfController {
	@Resource(name="kfService")
	private KfService service ;
	
	@RequestMapping(path="/work",method=RequestMethod.GET)
	public List<Map<String, Object>> getWorkOrderQuestionNum() {
		return service.getWorkOrderQuestionNum("2016-11-15~2017-03-15");
	}
}

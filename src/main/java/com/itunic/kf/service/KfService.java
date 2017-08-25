package com.itunic.kf.service;

import java.util.List;
import java.util.Map;

public interface KfService {
	public List<Map<String, Object>> getWorkOrderQuestionNum(String date);
	public Map<String,Object> getWorkOrderTask(String start,String end);
}

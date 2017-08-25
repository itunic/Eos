package com.itunic.kf.dao;

import java.util.List;
import java.util.Map;


public interface KfDao {
	/**
	 * 按照统计时间维度查询工单类型数量
	 * @param date
	 * @return
	 */
	public List<Map<String, Object>> getWorkOrderQuestionNum(String date);
	
	public List<Map<String, Object>> getWorkOrderTask(String start,String end);

}

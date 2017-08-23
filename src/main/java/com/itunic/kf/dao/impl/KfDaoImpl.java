package com.itunic.kf.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.itunic.kf.dao.KfDao;

@Component(value = "kfDao")
public class KfDaoImpl implements KfDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> getWorkOrderQuestionNum(String date) {
		
		return jdbcTemplate.queryForList("select concat_ws('~',start_time,end_time) as update_time, question as name,num as value from t_kf_workerorder_questiontype where result_date =?", date);
	}

}

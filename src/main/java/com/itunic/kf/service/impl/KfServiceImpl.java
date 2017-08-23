package com.itunic.kf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itunic.kf.dao.KfDao;
import com.itunic.kf.service.KfService;

@Service("kfService")
public class KfServiceImpl implements KfService {
	@Resource(name = "kfDao")
	private KfDao dao = null;

	@Override
	public List<Map<String, Object>> getWorkOrderQuestionNum(String date) {
		// TODO Auto-generated method stub
		return dao.getWorkOrderQuestionNum(date);
	}

}

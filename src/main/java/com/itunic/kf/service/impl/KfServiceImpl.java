package com.itunic.kf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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

	@Override
	public Map<String, Object> getWorkOrderTask(String start, String end) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = dao.getWorkOrderTask(start, end);
		Set<String> set = new HashSet<String>();
		Set<String> dateSet = new TreeSet<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 查找类型
		list.forEach(f -> {
			set.add(f.get("name").toString());
			dateSet.add(f.get("call_time").toString());

		});
		set.forEach(f -> {
			List<String> list1 = new ArrayList<String>();

			list.forEach(l -> {
				if (f.equals(l.get("name").toString())) {
					list1.add(l.get("value").toString());
				}

			});
			map.put(f, list1);
		});
		// list.stream().map(f->f.get(key)).collect();
		Map<String, Long> m = list.stream().map(f -> {
			TestVo vo = new TestVo();
			vo.setDate(f.get("call_time").toString());
			vo.setValue(Long.parseLong(f.get("value").toString()));
			return vo;
		}).collect(Collectors.groupingBy(TestVo::getDate, Collectors.summingLong(TestVo::getValue)));
		resultMap.put("date", dateSet);
		resultMap.put("result", map);
		resultMap.put("count", m);
		return resultMap;
	}

	private static class TestVo {
		private String date;
		private Long value;

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Long getValue() {
			return value;
		}

		public void setValue(Long value) {
			this.value = value;
		}

	}

}

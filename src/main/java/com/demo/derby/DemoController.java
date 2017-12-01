package com.demo.derby;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	@Resource
	DerbyDao derbyDao;
	
	
	@RequestMapping("/create")
	public Map create(){
		Map m = new HashMap();
		derbyDao.create();
		m.put("result", 0);
		return m;		
	}
	@RequestMapping("/insert")
	public Map insert(){
		Map m = new HashMap();
		derbyDao.insert();
		m.put("result", 0);
		return m;		
	}
	@RequestMapping("/query")
	public Map query(){
		Map m = new HashMap();
		List list = derbyDao.query();
		m.put("result", list);
		return m;		
	}
}

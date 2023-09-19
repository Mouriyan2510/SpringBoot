package com.example.AngularProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnesoftService {

	@Autowired
	OnesoftDao od;

	public OnesoftEntity post(OnesoftEntity o) {
		return od.post(o);
	}

	public List<OnesoftEntity> get() {
		return od.get();
	}

	public OnesoftEntity getid(int a) {
		return od.getid(a);
	}

	public OnesoftEntity update(OnesoftEntity e, int a) {
		return od.update(e,a);
	}

	public OnesoftEntity delet(int a) {
		return od.delet(a);
	}
}

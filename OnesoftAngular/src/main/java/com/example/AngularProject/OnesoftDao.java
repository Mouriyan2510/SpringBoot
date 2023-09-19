package com.example.AngularProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OnesoftDao {
	@Autowired
	OnesoftRepo or;

	public OnesoftEntity post(OnesoftEntity o) {
		return or.save(o);
	}

	public List<OnesoftEntity> get() {
		return or.findAll();
	}

	public OnesoftEntity getid(int a) {
		return or.findById(a).get();
	}

	public OnesoftEntity update(OnesoftEntity e, int a) {
		OnesoftEntity eee = or.findById(a).get();
		eee.setAge(e.getAge());
		eee.setId(e.getId());
		eee.setName(e.getName());
		eee.setGender(e.getGender());
		eee.setDate(e.getDate());
		 or.save(eee);
		 return e;
	}

	public OnesoftEntity delet(int a) {
		List<OnesoftEntity> p=or.findAll();
		OnesoftEntity e=or.findById(a).get();
		or.deleteById(a);
		return e;
	}

}

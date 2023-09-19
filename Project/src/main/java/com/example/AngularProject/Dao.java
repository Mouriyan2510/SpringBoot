package com.example.AngularProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Dao {
	
	@Autowired
	Repo r;

	public ProjectEntity post(ProjectEntity p) {
		return r.save(p);
	}

	public List<ProjectEntity> get() {
		return r.findAll();
	}

	public ProjectEntity delet(int a) {
		List<ProjectEntity> p=r.findAll();
		ProjectEntity e=r.findById(a).get();
		r.deleteById(a);
		return e;
	}

	public ProjectEntity getid(int a) {
		return r.findById(a).get();
	}

	public ProjectEntity update(ProjectEntity e,int a) {
		ProjectEntity eee = r.findById(a).get();
		eee.setAge(e.getAge());
		eee.setId(e.getId());
		eee.setName(e.getName());
		eee.setGender(e.getGender());
		eee.setDate(e.getDate());
		 r.save(eee);
		 return e;
	}
	
}

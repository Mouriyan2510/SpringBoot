package com.example.AngularProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class PService {

	@Autowired
	Dao d;

	public ProjectEntity post(ProjectEntity p) {
		return d.post(p);
	}

	public List<ProjectEntity> get() {
		return d.get();
	}

	public ProjectEntity delet(int a) {
		return d.delet(a);
	}

	public ProjectEntity getid(int a) {
		return d.getid(a);
	}

	public ProjectEntity update(ProjectEntity e, int a) {
		return d.update(e,a);
	}
	
}

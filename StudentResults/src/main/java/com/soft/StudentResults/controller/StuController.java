package com.soft.StudentResults.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.soft.StudentResults.entity.Results;
import com.soft.StudentResults.entity.StudentDetails;
import com.soft.StudentResults.entity.StudentMarkSheet;
import com.soft.StudentResults.service.StuService;

@RestController
@RequestMapping("results")
public class StuController {

	@Autowired
	StuService stuser;

	RestTemplate rest = new RestTemplate();
//	@GetMapping("getStudentTotaldetails")
//	public List<Integer> getStudentTotaldetails() {
//		String url="http://localhost:8081/marksheet/getsem12Total";
//		ResponseEntity <List<Integer>> response=rest.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference <List<Integer>>() {
//		});
//		List <Integer> value=response.getBody();
//		
//		return value;
//	}

	@GetMapping("InsertToDb")
	public String InsertToDb(Results r) {
		String url = "http://localhost:8080/student/getall";
		String url2 = "http://localhost:8081/marksheet/getAll";
		ResponseEntity<List<StudentDetails>> response = rest.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentDetails>>() {
				});
		List<StudentDetails> value = response.getBody();

		ResponseEntity<List<StudentMarkSheet>> response1 = rest.exchange(url2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentMarkSheet>>() {
				});

		List<StudentMarkSheet> value1 = response1.getBody();
		ArrayList<Results> ar = new ArrayList<>();
		value.stream().forEach(y -> {
			r.setId(y.getId());
			r.setName(y.getName());
			r.setRoll_Number(y.getRollNumber());
		});

		value1.stream().forEach(t -> {
			if (r.getRoll_Number() == t.getRollNumber()) {
				r.setPercentage((t.getSem1Total() + t.getSem2Total()) / 2);
				r.setTotalMarks(t.getSem1Total() + t.getSem2Total());
			}
		});

		return stuser.InsertToDb(r);
	}

	@PutMapping("/updateByRoll/{roll}")
	public String updateByRoll(@RequestBody Results a, @PathVariable int roll) {
		return stuser.updateByRoll(a, roll);
	}

	@PostMapping("/add5markpost")
	public String add5markpost() {
		String url1 = "http://localhost:8080/student/getall";
		ResponseEntity<List<StudentDetails>> studentResponse = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentDetails>>() {
				});
		List<StudentDetails> stu = studentResponse.getBody();
		List<Results> result = new ArrayList<>();

		for (StudentDetails x : stu) {
			String url2 = "http://localhost:8081/marksheet/getById/";
			ResponseEntity<StudentMarkSheet> markResponse = rest.exchange(url2 + x.getId(), HttpMethod.GET, null,
					new ParameterizedTypeReference<StudentMarkSheet>() {
					});
			StudentMarkSheet marksheet = markResponse.getBody();
			int overAll = marksheet.getSem1Total() + marksheet.getSem2Total();
			int total = overAll / 2;
			int percentage = total;

			Results r = new Results();
			if (x.getAttendance() > 90) {
				total = total + 5;
				percentage = total;
				if (total > 100) {
					total = 100;
				}
			}
			r.setRoll_Number(x.getRollNumber());
			r.setName(x.getName());
			r.setTotalMarks((marksheet.getSem1Total() + marksheet.getSem2Total()) / 2);
			r.setPercentage((marksheet.getSem1Total() + marksheet.getSem2Total()) / 2);
			result.add(r);
		}
		return stuser.add5markpost(result);
	}

	@GetMapping("getAllMark")
	public List<Results> getallmarks() {
		return stuser.getallmarks();
	}

	@GetMapping("/get3Toppers")
	public List<Results> get3Toppers() {
		String url1 = "http://localhost:8082/results/getAllMark";
		ResponseEntity<List<Results>> resultsResponse = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Results>>() {
				});
		List<Results> allRes = resultsResponse.getBody();
		List<Results> top3 = allRes.stream().sorted(Comparator.comparing(Results::getTotalMarks).reversed()).limit(3)
				.collect(Collectors.toList());
		return top3;
	}

	@GetMapping("getTopper")
	public Results getTopper() {
		String url1 = "http://localhost:8082/results/getAllMark";
		ResponseEntity<List<Results>> resultsResponse = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Results>>() {
				});
		List<Results> allRes = resultsResponse.getBody();
		Results ar = allRes.stream().max(Comparator.comparing(Results::getTotalMarks)).get();
		return ar;
	}

	@GetMapping("getRangeMarks")
	public List<Results> getRangeMarks() {
		String url1 = "http://localhost:8082/results/getAllMark";
		ResponseEntity<List<Results>> resultsResponse = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Results>>() {
				});
		List<Results> allRes = resultsResponse.getBody();

		List<Results> at = allRes.stream().filter(y -> y.getTotalMarks() >= 70 && y.getTotalMarks() <= 90)
				.collect(Collectors.toList());

		return at;
	}

}

package com.soft.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	SenderRepository senRepo;
	
	@Autowired
	ReceiverRepository recRepo;
	
	
	@PostMapping("/postThis")
	public String post(@RequestBody TransactionClass t) {
		senRepo.save(t.getSend());
		recRepo.save(t.getReceive());
		return "Saved";
	}
}

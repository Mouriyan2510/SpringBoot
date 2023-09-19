package com.soft.Customer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.*;

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

import com.soft.Customer.entity.BankEntity;
import com.soft.Customer.entity.CustomerEntity;
import com.soft.Customer.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService custser;

	@PostMapping("insertalldata")
	public String insertalldata(@RequestBody List<CustomerEntity> ce) {
		return custser.insertalldata(ce);
	}

	@GetMapping("getoneiddetail/{a}")
	public CustomerEntity getoneiddetail(@PathVariable int a) {
		return custser.getoneiddetail(a);
	}
	

	@GetMapping("getalliddetail")
	public List<CustomerEntity> getalliddetail() {
		return custser.getalliddetail();
	}

	RestTemplate rest = new RestTemplate();

	@PutMapping("insertifsc")
	public String insertifsc() {
		String url = "http://localhost:8080/bank/getalliddetail";
		ResponseEntity<List<BankEntity>> response = rest.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<BankEntity>>() {
				});
		List<BankEntity> value = response.getBody();
		List<CustomerEntity> resultsDetails = new ArrayList<>();
		for (BankEntity x : value) {
			String url2 = "http://localhost:8081/customer/getoneiddetail/";
			ResponseEntity <CustomerEntity> response1 = rest.exchange(url2+x.getId(), HttpMethod.GET, null,
					new ParameterizedTypeReference <CustomerEntity>() {
					});
			CustomerEntity value2 = response1.getBody();
			CustomerEntity ce=new CustomerEntity();
			ce.setIfsccode(x.getIfsccode());
			resultsDetails.add(ce);
		}
		
		return custser.insertifsc(resultsDetails);
	}

	
//	public class DataTransfer {
//		@PostMapping("insertdetails")
//		public static void main(String[] args) {
//
//			// Connection details for the source server
//			String sourceUrl = "jdbc:mysql://localhost:3306/test_db";
//			String sourceUsername = "root";
//			String sourcePassword = "root";
//
//			// Connection details for the destination server
//			String destUrl = "jdbc:mysql://localhost:3306/test_db";
//			String destUsername = "root";
//			String destPassword = "root";
//
//			// SQL query to retrieve the data from the source server
//			String sqlQuery = "select ifsccode from bank_details where id=?";
//
//			try (
//					// Connect to the source server
//					Connection sourceConnection = DriverManager.getConnection(sourceUrl, sourceUsername,
//							sourcePassword);
//					// Execute the query to retrieve the data
//					Statement sourceStatement = sourceConnection.createStatement();
//					ResultSet resultSet = sourceStatement.executeQuery(sqlQuery);
//					// Connect to the destination server
//					Connection destConnection = DriverManager.getConnection(destUrl, destUsername, destPassword);
//					// Prepare the INSERT statement for the destination server
//					PreparedStatement destStatement = destConnection
//							.prepareStatement("Insert into customer_details (ifsccode) values (?)");) {
//				while (resultSet.next()) {
//					// Retrieve the data from the source server
////					String ifsccode = resultSet.getString("CNRB0003755");
////            String ifsccode2 = resultSet.getString("CNRB0002628");
////            String ifsccode3 = resultSet.getString("CNRB0001201");
////            String ifsccode4 = resultSet.getString("CNRB0005685");
////            String ifsccode5 = resultSet.getString("CNRB0003438");
//
//					// Insert the data into the destination server
////					destStatement.setString(1, ifsccode);
////            destStatement.setString(2, ifsccode2);
////            destStatement.setString(3, ifsccode3);
////            destStatement.setString(4, ifsccode4);
////            destStatement.setString(5, ifsccode5);
//					
//					destStatement.setString(1, resultSet.getString("column1"));
//
//					destStatement.executeUpdate();
//				}
//
//				System.out.println("Data transfer complete.");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}

}

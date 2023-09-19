package com.soft.connectprogst;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConnectProGstController {

	@Autowired
	RestTemplate rest; 

	@GetMapping("getproductdetails")
	public List<ProductEntity> getproduct() {
		String url = "http://localhost:8080/product/getoneidall";
		ResponseEntity<List<ProductEntity>> response = rest.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProductEntity>>() {
				});
		List<ProductEntity> value = response.getBody();
//		List <ProductEntity> at=value.stream().filter(y->y.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
//		at.stream().forEach(i-> {
//			int z=i.getPrice()+(i.getPrice()+5)/100;
//			i.setPrice(z);
//		});
		return value;

	}

	@GetMapping("getproductPrice")
	public List<Integer> getprice() {
		String url = "http://localhost:8080/product/getallprice";
		ResponseEntity<List<Integer>> response = rest.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Integer>>() {
				});
		List<Integer> value = response.getBody();
//		List <ProductEntity> at=value.stream().filter(y->y.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
//		at.stream().forEach(i-> {
//			int z=i.getPrice()+(i.getPrice()+5)/100;
//			i.setPrice(z);
//		});
		return value;

	}

	@GetMapping("getgstdetails")
	public List<GstEntity> getGst() {
		String url = "http://localhost:8081/gst/getbyidall";
		ResponseEntity<List<GstEntity>> response = rest.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<GstEntity>>() {
				});
		List<GstEntity> value = response.getBody();
//			List <GstEntity> at=value.stream().filter(y->y.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
//			at.stream().forEach(i-> {
//				int z=i.getPrice()+(i.getPrice()+5)/100;
//				i.setPrice(z);
//			});
		return value;

	}

	@GetMapping("getallPercentage")
	public List<Integer> getallPercentage() {
		String url = "http://localhost:8081/gst/getallPercentage";
		ResponseEntity<List<Integer>> response = rest.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Integer>>() {
				});
		List<Integer> value = response.getBody();
//			List <GstEntity> at=value.stream().filter(y->y.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
//			at.stream().forEach(i-> {
//				int z=i.getPrice()+(i.getPrice()+5)/100;
//				i.setPrice(z);
//			});
		return value;

	}

	@GetMapping("connectingpriceandpercentage")
	public List<Integer> connectingpriceandpercentage() {
		String priceUrl = "http://localhost:8080/product/getallprice";
		String percentageUrl = "http://localhost:8081/gst/getallPercentage";
		ResponseEntity<List<Integer>> priceResponse = rest.exchange(priceUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Integer>>() {
				});
		ResponseEntity<List<Integer>> percentageResponse = rest.exchange(percentageUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Integer>>() {
				});
		List<Integer> priceValue = priceResponse.getBody();
		List<Integer> percentageValue = percentageResponse.getBody();

		List<Integer> result = calculateLists(priceValue, percentageValue);
//			System.out.println(result);
		return result;
	}

	public static List<Integer> calculateLists(List<Integer> list1, List<Integer> list2) {
		List<Integer> result = new ArrayList<>();
		if (list1.size() != list2.size()) {
			throw new IllegalArgumentException("Lists must have the same size");
		}
		for (int i = 0; i < list1.size(); i++) {
			int product = list1.get(i) + (list1.get(i) * list2.get(i)) / 100;
			result.add((int) product);
		}
		return result;

//			List <GstEntity> at=value.stream().filter(y->y.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
//			at.stream().forEach(i-> {
//				int z=i.getPrice()+(i.getPrice()+5)/100;
//				i.setPrice(z);
//			});

	}

	@GetMapping("/connectingpriceandpercentage1")
	public List<ProductEntity> connectingpriceandpercentage1() {
		String priceUrl = "http://localhost:8080/product/getoneidall";
		String percentageUrl = "http://localhost:8081/gst/getPerByHsn/";
		ResponseEntity<List<ProductEntity>> priceResponse = rest.exchange(priceUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProductEntity>>() {
				});
		List<ProductEntity> p = priceResponse.getBody();
		for (ProductEntity f : p) {
			ResponseEntity<Integer> res2 = rest.exchange(percentageUrl + f.getHsn(), HttpMethod.GET, null,
					Integer.class);
			int percentage = res2.getBody();
			f.setPrice(f.getPrice() + f.getPrice() * percentage/ 100);
		}
		return p;
	}

}
